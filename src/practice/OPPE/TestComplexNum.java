package practice.OPPE;

class ComplexNum<T extends Number> {
    T real;
    T img;

    public ComplexNum(T r,T i){
        real=r;
        img = i;
    }

    public ComplexNum<Double> add(ComplexNum<? extends Number> o){
        Double real = this.real.doubleValue() + o.real.doubleValue();
        Double img = this.img.doubleValue() + o.img.doubleValue();
        return new ComplexNum<Double>(real, img);
    }
    
    public String toString(){
        return (real +" + "+img+"i");
    }
    
}

public class TestComplexNum {

    public static void main(String[] args) {
        ComplexNum<Integer> c1 = new ComplexNum<>(1,2 );
        ComplexNum<Double> c2 = new ComplexNum<>(10.3,20.2 );
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 +" + "+ c2 +" = "+ c3);

    }
}
