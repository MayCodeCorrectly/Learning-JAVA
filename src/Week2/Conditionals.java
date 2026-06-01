package Week2;

public class Conditionals {
    public static void main(String args[]){
        int v=10;
        System.out.println(sign(v));

        System.out.println("Sum till 10 numbers is: "+sumupto(10));
        System.out.println("Sum till 10 numbers is: "+sumupto_n(10));

        int arr[] = new int[]{10,20,30,40};
        print_arr(arr);
        clean_print_arr(arr);

        System.out.println(sum(arr));

        double[] arr2 = new double[]{1,2.3,4.6,7.9};
        System.out.println(sum(arr2));

        print_sign(v);
    }

    public static int sign(int v){
        if (v>0){
            return 1;
        }
        else if(v<0){
            return -1;
        }
        else return 0;
    } 

    public static int sumupto(int n){
        int sum= 0;
        while (n>0){
            sum+=n;
            n--;
        }
        return sum;
    }

    public static void do_while(int x){
        do{
            System.out.println("doing something");
        }while(true);
    }

    public static int sumupto_n(int x){
        int sum = 0;
        int i=1;
        do{
            sum += i;
            i++;
        }while(i<=x);
        return sum;
    }

    public static void print_arr(int[] arr){
        for(int x:arr) System.out.print(x+",");
        System.out.println();
    }

    public static void clean_print_arr(int[] arr){
        for(int x:arr){
            if (x!= arr[arr.length-1]){
                System.out.print(x+",");
            }
            else{
                System.out.println(x);
            }
        }
    }

    public static int sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static double sum(double arr[]){
        double sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        // }
        for(double x:arr) sum+=x;
        return sum;
    }

    // ============= Switch Case ===========
    public static void print_sign(int v){
        switch (sign(v)) { //calling the function sign
            case -1:
                System.out.println("Negative");
                break;
            case 1:
                System.out.println("Positive");
                // break is important otherwise fall through will happen
                break;
            default:
                System.out.println("Zero");
                break;
        }
    }
}
