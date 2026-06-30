package practice.week2.Challenges;
import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int sum = 0;

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                sum += Math.powExact(j,2);
            }
        }

        System.out.println(sum);
    }
}
