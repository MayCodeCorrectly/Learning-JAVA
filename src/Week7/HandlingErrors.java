package Week7;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class HandlingErrors {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in); // this is valid too
        // The function/method calling the function/method which can throw exception
        // should always handle that error or else it will generate compiler error
        try {
            System.out.println("Starting Program");
            Logger.getGlobal().info("Invoked Function");
            readFile(0);
        }
        catch (EOFException e){  // it can be any type
            System.out.println(e);
        }
        catch (Exception i){   // we can have many catch block for Exceptions
            System.out.println(i);
        }
        finally {
            // this always gets executed does not matter whether try throws error or not
            // used for clean up
            System.out.println("Process Completed");
        }

    }

    // a function which may throw Exception should have those declared in its header
    // single method/function can throw multiple Exception's
    // throw and throws
    public static void readFile(int fLen) throws EOFException , FileNotFoundException {
        if(fLen == 0){
            throw  new FileNotFoundException("File is Empty!!!");
        }
        else if(fLen <2048){
            throw new EOFException("Expected length: 2048, Actual length: "+fLen);
        }
        else {
            System.out.println("Processing the file");
        }
    }
}
