package practice.week2.Challenges;

import java.util.Scanner;

public class FibonacciSeries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag =false;
        do{
            System.out.print("Enter the any positive number: ");
            int num = sc.nextInt();
            if(num>=0){
                flag = true;
                fib(num);
            }
            else System.out.println("Invalid number, Enter positive integer");
        }while (!flag);
    }

    static void fib(int n){
        int a=0,b=1,next;
        System.out.print("First "+n+"terms of Fibonacci Sequence are "+a+" "+b);
        for(int i=0;i<n-2;i++){
            next = a+b;
            System.out.print(" "+next);
            a = b;
            b = next;
        }
    }
}
