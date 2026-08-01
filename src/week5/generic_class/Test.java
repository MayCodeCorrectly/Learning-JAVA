package week5.generic_class;

public class Test {
    static void main(String[] args) {

        // Testing box
        Box<Integer> my_num = new Box<>(); // Box is now type safe
        my_num.setValue(10);
        int i = my_num.getValue();  // totally valid no need to cast
        System.out.println(my_num.getValue()+" "+ my_num.getClass().getSimpleName());  // Box not Integer

        Box<String> my_name = new Box<>();
        my_name.setValue("Sandeep");
        System.out.println(my_name.getValue());

        // Testing Pair
        Pair<String,Integer> my_pair = new Pair<>("Sandeep",20);
        System.out.println(my_pair);
    }
}
