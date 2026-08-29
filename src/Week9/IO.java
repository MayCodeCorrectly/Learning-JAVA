package Week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

import javax.print.DocFlavor.INPUT_STREAM;

public class IO {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(
                    new FileInputStream("C:\\Users\\sandeep\\Learnings\\Learning-JAVA\\src\\Week9\\sample.txt"));
            // Scanner sc = new Scanner(
            //         new FileInputStream("sample.txt"));  this won't work
            String fname = sc.next();
            String lname = sc.next();
            // int age= sc.nextInt();
            System.out.println("The name in file is " + fname + " " + lname + " and his age is ");

        } catch (FileNotFoundException e) {
            System.out.println("File does not exits!!");
            
        }
    }
}
