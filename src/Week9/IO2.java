package Week9;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class IO2 {
    public static void main(String[] args) {
        
        
        try {
            // while writing in the file we have 2 options which are 
            // if the file already exists
            // 1. Override -> false (erase content from the file and write new given one)
            // 2. Append -> true (add this content to the file )
            var op = new FileOutputStream("C:\\Users\\sandeep\\Learnings\\Learning-JAVA\\src\\Week9\\sample.txt", true);
            var printOP = new PrintWriter(op);

            String mes = " here i change the message in output file and is will completely replaced";
            printOP.print(mes);

            printOP.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Task Completed");
        }

    }
}
