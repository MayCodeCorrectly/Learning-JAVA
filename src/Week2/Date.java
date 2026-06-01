package Week2;

public class Date {
    private int Day,Month,Year;
    // Now these variables are private and only accessible in class

    // constructor
    // gets called whenever new object is created
    // has same name as Class
    public Date(int d,int m,int y){
        Day = d; Month = m; Year = y;
    }

    // constructor overloading
    public Date(int d,int m){
        this(d,m,2026); // later constructor calling earlier constructor
        // or we can do this too
        //Day = d; Month = m; Year = 2026;
    }

    // copy constructor input  is Date object
    public Date(Date d){
        this.Day = d.Day;
        this.Month = d.Month;
        this.Year = d.Year;
    }

    public void setDate(int d,int m,int y){
        this.Day = d;
        this.Month = m;
        Year = y;
        // this. keyword is optional here since it is unambiguous which Day, Month and Year 
    }

    // method overloading
    public void setDate(int d,int m){
        Day = d;
        Month = m;
        Year = 2026;
        // this. keyword is optional here since it is unambiguous which Day, Month and Year 
    }

    public static void main(){
        Date  birth_day = new Date(0,0,0); // now wee need to give arguments to init object
        birth_day.setDate(25,12,2005);
        
        birth_day.Day= 10; // you can manipulate Day because you are inside tha class => allowed
        System.out.println(birth_day.Day);
    }

    // changing equals => an Object Method
    @Override
    public boolean equals(Object o){
        if (o instanceof Date){
            Date myd = (Date) o;
            return ((this.Day == myd.Day) && (this.Month == myd.Month) && (this.Year == myd.Year));
        }
        return false;
    }


}
