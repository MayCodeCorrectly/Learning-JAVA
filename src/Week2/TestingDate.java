package Week2;

public class TestingDate {
    public static void main(){
        Date d1 = new Date(25,12,2005);
        Date d2 = new Date(25,12,2005);

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        // earlier before overriding equals method we gate both as false

        Date d3  = new Date(15,5,2004);
        Date  d4 = d3;
        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));
        //  here both are true

        // after overring
    }
}
