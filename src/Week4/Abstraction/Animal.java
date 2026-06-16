package Week4.Abstraction;

public abstract class Animal {
    // Abstract class can have Concrete and Abstract methods
    // 1. if class is having abstract method/s then class needs to be abstract
    // 2. But abstract class can have all its methods as Concrete
    // 3. that means abstract class does not necessity to have abstract methods

    private String Name;
    private int Age;
    private String Sex;

    // this is now class property => Class.porperty not Object.property
    private static int count;

    // protected because we never goona make object of animal class this is just for child classes
    protected Animal(String name, String sex, int age){
        this.Name = name;
        this.Sex = sex;
        this.Age = age;

        // how many object of this class or its subclass are made
        count++;
    }

    // can not change from outside so no setter only getter which is static
    public static int getCount(){
        return count;
    }

    public abstract void Sound();

    public abstract void Eats();

    @Override
    public String toString(){
        // instead of getName use getSimpleName() it will remove that package thing so no need to use SubString
        return "This animal is "+ this.getClass().getName().substring(18)+" and his/her name is "+this.Name;
    }

    public void Sleep(){
        System.out.println(this.getClass().getName().substring(18)+ " is Sleeping ZZzz....");
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
