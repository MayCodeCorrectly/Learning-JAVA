package Week4.Interface;

public abstract class Phone {
    String model_name;

    public Phone(String model){
        this.model_name = model;
    }

    public abstract void PowerOn();
    public abstract void PowerOff();
}
