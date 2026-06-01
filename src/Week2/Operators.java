package Week2;

public class Operators {
    public static void main(String args[]){

        // all arithmetic operators work same except / => int/int => int 
        // e.g, 2/3 = 0 not float part
        System.out.println("Here it starts");
        
        final float pi = 22/7; // value is 3.0 not 3.14
        System.out.println(pi);
        final double accurate_pi = 22.0/7; // now accurate value
        // but if you want float do 22.0f/7 we get float by this
        System.out.println(accurate_pi);

        long square= Math.powExact(2, 10);
        System.out.println(square);

        int a =0;
        a++; //increment by 1
        a--; //decrement by 1
    }
}
