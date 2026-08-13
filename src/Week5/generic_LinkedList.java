package Week5;

interface Iterator<T>{
    boolean hasNext();
    T getNext();
}

class LinkedList<T> {
    private Node head;
    private int size=0;

    public LinkedList(T o) {
        head = new Node(o);
        size++;
    }

    public LinkedList() {

    }

    public void append(T o) {
        if (head == null) {
            head = new Node(o);
        } else {
            Node temp = head;
            while (true) {
                if (temp.next != null){
                    temp = temp.next;
                }else break;
            }
            temp.next = new Node(o);
        }
        size++;
    }

    public  void printList(){
        Iterator<T> it = new Iter();
        String req_str = "[";
        while(it.hasNext()){
            T ob = it.getNext();
            req_str += (String) ob +", ";
        }
        System.out.println(req_str.substring(0,req_str.length()-2)+"]");
    }

    public int getSize() {
        return size;
    }

    public Iterator<T> getIterator() {
        return new Iter();
    }

    private class Iter implements Iterator<T>{
        public Node start = head;

        @Override
        public boolean hasNext() {
            if (start == null){
                return false;
            }
            else return true;
        }

        @Override
        public T getNext() {
            if(hasNext()){
                Node temp = start;
                start = start.next;
                return temp.data;
            }else return null;
        }
    }

        private class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }



}


public class generic_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> strList = new LinkedList<>();
        strList.append("Hello");
        strList.append("There");
        strList.append("Hmmm");
        System.out.println(strList.getSize());

        Iterator<String> it = strList.getIterator();
        while (it.hasNext()){
            String s = it.getNext();
            System.out.println(s);
        }

        strList.printList();

    }
}
