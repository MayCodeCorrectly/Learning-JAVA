package practice.week3;

abstract class Arithmetic{
    Arithmetic(){
        System.out.println("Basic operators in Mathematics: ");
    }

    abstract String operations();
}

public class Algebra extends Arithmetic{
    public String operations(){
        return "+, -, x, %";
    }

    public static void main(String args[]){
        System.out.println(new Algebra().operations());
//        System.gc(); runs garbage collection on demand
    }
}