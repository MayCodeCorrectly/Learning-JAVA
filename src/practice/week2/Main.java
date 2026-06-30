package practice.week2;

public class Main {
    static void main(String[] args) {

        boolean flag = true;
        int age=20;

        System.out.println(flag && age>20);

        int[] arr = new int[20];
//        System.out.println(arr[21]); // throws out of bound error
        String new_str= new String();   //"Holds empty String"
        System.out.println(new_str);

        // Shallow copy
        Car c1 = new Car();
        c1.top_speed = 150;

        Car c2 = new Car();
        c2.top_speed = 200;
        c2.e.engine_name =  "V8";

        Car c3 = c2;
        System.out.println(c3.top_speed); // engine name did not get copied

        c2.top_speed = 500;
        System.out.println(c3.top_speed);

    }
}


class Car{
    public int top_speed;
    public engine e;
}

class engine{
    public String engine_name;
}