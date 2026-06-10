package Week4;

public class Interface extends  Abstract implements A,B{

    @Override
    public void methodA() {
        System.out.println("Method A implemented");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented");
    }

    public void my_method(){
        System.out.println("implemented my_method");
    }
}


