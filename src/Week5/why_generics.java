package Week5;

public class why_generics {
    public static void main(String[] args) {
        var num = 10;
        System.out.println(num);

        var name = "Hello from program";
        System.out.println(name);

        int x= 10;
        long y= x;  // No errors but  // this is upcasting
//        int z = y; // this will throw error cause long can hold int but int can not hold long
        int z = (int)y; // and this is down casting


        // why do we need generics?? 1.Type lost 2.Manual casting 3.No compile time error (only run-time exceptions)
        Box[] items = new Box[4];
        items[0] = new Box(5);
        items[0] = new Box("Hello");
        items[0] = new Box(3.14159);
        items[0] = new Box(true);

        // after putting this value into Box we don't have idea of what type they are
        Integer a = (Integer) items[0].getValue();
        String b = (String) items[0].getValue();
        Double c = (Double) items[0].getValue();
        Integer d = (Integer) items[0].getValue(); // we have no idea what item is here
        // this casting will fail at runtime
        // And thus it seems like we can not store objects of different type into one collection

    }
}

class Box{
    private Object value;

    public Box(Object v){
        this.value = v;
    }

    public void setValue(Object v){
        this.value = v;
    }

    public Object getValue(){
        return this.value;
    }
}