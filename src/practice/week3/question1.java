package practice.week3;

class A{
    public void show(){
        System.out.println("A show() called");
    }
}
class B extends A{
//    void show(){
//        System.out.println("B show() called");
//    } // this throws error that lower accessibility/ visibility
}
public class question1{
    public static void main(String[] args){
        B ob=new B();
        ob.show();
    }
}
