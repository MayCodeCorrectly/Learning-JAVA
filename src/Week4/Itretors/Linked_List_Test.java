package Week4.Itretors;

interface Iterable{
    boolean has_next();
    Object get_next();
}

class LinkedList {

    private Node head;
    private int size;

    public int length() {
        return this.size;
    }

    public LinkedList() {
        size = 0;
    }

    public LinkedList(Object o) {
        head = new Node(o);
        size = 1;
    }

    public void append(Object o) {
        Node new_node = new Node(o);
        if (head != null) {
            Node temp;
            for (temp = head; temp.next != null; temp = temp.next) {} // do nothing till temp ends
            temp.next = new_node;
        } else head = new_node;
        // does not matter if or else increment the size
        size++;
    }

    private class Node {
        Object data;
        Node next;

        public Node(Object n) {
            this.data = n;
            this.next = null;
        }
    }

    public Iterable get_iter() {
        Iterable itr = new iter();
        return itr;
    }

    private class iter implements Iterable {

        private Node start = head;

        @Override
        public boolean has_next() {
            if (start == null){
                return false;
            }
            else return true;
        }

        @Override
        public Object get_next() {
            if (has_next()) {
                Node temp = start;
                start = start.next;
                return temp.data;
            } else return null;
        }
    }
}


public class Linked_List_Test {
    static void main(String[] args) {

        LinkedList ll = new LinkedList(50);
        ll.append(10);
        ll.append(30);
        ll.append(40);
        ll.append("Hello!");
        ll.append(10.78);
        ll.append('F');
        System.out.println(ll.length());

        Iterable it= ll.get_iter();

        while (it.has_next()){
            System.out.println(it.get_next());
        }
    }
}

