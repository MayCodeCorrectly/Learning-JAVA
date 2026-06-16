package practice.week1;

public class Utils {

    // Utils is the class we do not want to create any object
    // Because all the methods in this class are Static
    // So make a private constructor for this class

    private Utils(){}
    // Now no one can make an object of this class

    public static int compare(int a,int b){
        if(a>b) return 1;
        else if (a<b) return -1;
        else  return 0;
    }

}
