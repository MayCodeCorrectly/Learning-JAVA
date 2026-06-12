package Week3.Inheritance;

public class GrandParent {
    private String name;
    private int age;

    private boolean hasPower;

    // constructor
    public GrandParent(){
        hasPower = true;
        System.out.println("This is from GrandParent Class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int num){
        this.age = num;
    }

    public boolean hasPower(){
        return hasPower;
    }
}
