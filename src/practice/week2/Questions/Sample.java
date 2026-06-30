package practice.week2.Questions;

public class Sample
{
    public static void main (String args[])
    {
        System.out.println(10+20+"IIT Madras");
        System.out.println("IIT Madras"+10+20);

        int arr[] = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 9;
        n = arr[arr[n] / 2];
        System.out.println(arr[n] / 3);
    }
}
