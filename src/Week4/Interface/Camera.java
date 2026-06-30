package Week4.Interface;

// everything is public by default in Interface except Interface
public interface Camera {
    // this above all are (public abstract return_type func_name) implicitly

    void PowerON();
    void ClickPhoto();
    void SavePhoto();
    void DeletePhoto();
    void PowerOff();

    public static final int price=1000000;
    // look static is redundant because any variable declared in Interface is by default "public static final"
    // and it can not be private
    int price2 = 1000000;
    // price2 has same modifier as price

    // Interface can have static or default methods inside it also
    public static void info(){
        System.out.println("This is Camera interface");
    }
    // above can be accessed by Camera.info();
    // but can not be used this way SmartPhone.info()

    // default methods are concrete methods used to implement without breaking implementing class
    // these methods is accessed by instance of implementing class
    public default void fps(){
        System.out.println("This camera has 120fps video shooting");
    }

    // we can even write main method inside interface
    static void main(String[] args) {
        System.out.println("Hello from Camera interface");
    }
}
