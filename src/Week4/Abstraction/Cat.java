package Week4.Abstraction;

public class Cat extends Animal {
    
    public Cat(String n,String c,int a){
        super(n,c,a);
    }

    @Override
    public void Sound(){
        System.out.println("Meow Meow");
    }

    @Override
    public void Eats(){
        System.out.println("Cat Food and Rats");
    }
}
