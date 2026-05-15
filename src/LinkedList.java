import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println("node: "+temp.value);
            temp = temp.next;
        }

        System.out.println("tail: "+tail.value);
        System.out.println("head: "+head.value);
        System.out.println("lenght: "+length);

    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for( int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if( temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        if(index == 0){ //only one item in the list
            prepend(value);
            return true;
        }
        if (index == length){ //last item on the list
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index -1 );
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if( index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
        Node prev = get(index -1 );
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0; i< length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            fast = fast.next;
            if(fast == null)
            {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            fast = fast.next;
            if(fast == null)
            {
                break;
            }
            if(fast == slow)
            {
                return true;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;
        if(k <= 0){
            return null;
        }
        for(int i = 0; i<k;i++)
        {
            if(fast == null)
            {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void removeDuplicates() {

        Set<Integer> values = new HashSet<>();

        Node previous = null;
        Node current = head;

        while (current != null) {

            if (values.contains(current.value)) {

                // remove duplicate node
                previous.next = current.next;

            } else {

                values.add(current.value);
                previous = current;
            }

            current = current.next;
        }
    }

    public int binaryToDecimal(){
        Node current = head;
        int num = 0;
        while(current !=  null){
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }

    public void partitionList(int x)
    {
        if(head != null)
        {
            Node d1 = new Node(0);
            Node d2 = new Node(0);
            Node current = head;
            Node prev1 = d1;
            Node prev2 = d2;
            while(current != null){
                if(current.value < x){
                    prev1.next = current;
                    prev1 = current;
                    current = current.next;
                    prev1.next = null;
                }
                else if(current.value >= x)
                {
                    prev2.next = current;
                    prev2 = current;
                    current = current.next;
                    prev2.next = null;
                }
            }
            prev1.next = d2.next;
            head = d1.next;
            d1.next = null;
            d2.next = null;
        }
    }


}
