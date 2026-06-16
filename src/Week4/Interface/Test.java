package Week4.Interface;

public class Test {
    static void main(String[] args) {
        SmartPhone s =new SmartPhone("IQOO z9s Pro");

        System.out.println(SmartPhone.price);  // it is from Interface of Camera
        System.out.println(Camera.price); // can be access from here too

        Camera.info(); // static method inside interface
        //SmartPhone.info(); // error => Static method may only be called on its containing interface

        s.fps(); // this is default method from interface Camera
    }
}
