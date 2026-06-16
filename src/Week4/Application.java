package Week4;

public class Application extends  Abstract implements A,B{

    @Override
    public void methodA() {
        System.out.println("Method A implemented");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented");
    }

    // @Override => is just an annotation which throws error if we aren't overriding any method
    @Override
    public void my_method(){
        System.out.println("implemented my_method");
    }
}