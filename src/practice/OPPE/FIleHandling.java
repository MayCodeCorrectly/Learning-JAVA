package practice.OPPE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class FIleHandling {
    public static void main(String[] args) {
        try {
            // reading from the file
            var fIn = new FileInputStream("src\\practice\\OPPE\\outfile.txt");
            Scanner sc = new Scanner(fIn);

            while (sc.hasNext()) {
                String text = sc.next();
                System.out.println(text);
            }

            // writing to the file
            FileOutputStream fOut = new FileOutputStream("src\\practice\\OPPE\\resultFile.txt", true);
            PrintWriter pOut = new PrintWriter(fOut);
            String content = "This is what i want to write in this file";
            pOut.println(content);
            pOut.close(); // No need to close if opened in try 

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (Exception e){
            System.out.println("This is writing fault");
        } 

    }
}
