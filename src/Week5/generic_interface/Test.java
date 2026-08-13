package Week5.generic_interface;

public class Test {
    static void main(String[] args) {

        StringContainer list = new StringContainer();
        list.add("Hello");
        list.add("world");
        list.add("!!");
        System.out.println(list.get(2));
        System.out.println(list);

    }
}
