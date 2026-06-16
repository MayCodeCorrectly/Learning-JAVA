package Week4.Abstraction;

public class Dog extends Animal {
    public Dog(String n,String s,int a){
        super(n,s,a);
    }

    @Override
    public void Sound(){
        System.out.println("Woof Woof");
    }

    @Override
    public void Eats(){
        System.out.println("Dog Food");
    }
}

