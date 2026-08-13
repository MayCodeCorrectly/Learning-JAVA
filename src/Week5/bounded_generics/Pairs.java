package Week5.bounded_generics;

public class Pairs <X extends Number,Y extends Number> {
    private X pointx;
    private Y pointy;
    public  Pairs(X x,Y y){
        pointx = x;
        pointy = y;
    }

    public X getPointx() {
        return pointx;
    }

    public Y getPointy() {
        return pointy;
    }

    public void setPointy(Y pointy) {
        this.pointy = pointy;
    }

    public void setPointx(X pointx) {
        this.pointx = pointx;
    }

    public double distFromO(){
        return Math.sqrt(Math.pow(pointx.doubleValue(),2)+Math.pow(pointy.doubleValue(),2));
    }


    // more secure version of this (public double distFromP(Pairs p)) is below
    public double distFromP(Pairs<? extends Number,? extends Number> p){
        double dx = Math.abs(this.pointx.doubleValue()-p.pointx.doubleValue());
        double dy = Math.abs(this.pointy.doubleValue()-p.pointy.doubleValue());
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }

    // most interesting thing
    public <X> void extraMethod(X ele){
        System.out.println("Extra element: "+ele);
    }
    // Now that X (type-quantifier) is totally different from the X from class

    public static void main(String[] args) {
        Pairs<Integer,Integer> myPair1 = new Pairs<>(10,10);
        System.out.println(myPair1.distFromO());

        Pairs<Integer,Double> myPair2 = new Pairs<>(5,6.5);
        System.out.println(myPair2.distFromO());

        System.out.println(myPair1.distFromP(myPair2));

        myPair1.extraMethod("Hello there! This arg can be of any type");
        myPair1.extraMethod(10.2348);

    }
}
