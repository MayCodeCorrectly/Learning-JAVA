package Week3.Inheritance;

public class Child extends Parent{

    public Child(){
        System.out.println("This is from Child Class");
    }

    @Override
    public void setAge(int num) {
        if (num <= 28) {
            super.setAge(num);  // method of parent class
        } else {
            System.out.println("Cannot assign age greater than \"28\" ")
            ;
        }
    }
}
