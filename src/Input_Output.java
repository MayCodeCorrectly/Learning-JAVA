import java.io.Console;
import java.util.Scanner;

public class Input_Output {

    public  static void main(String[] args){
        // to print to console /output stream
        System.out.println("Here we go!");
        System.out.printf("Now this is C-style printing %d%n",10);

        // But how do we read data? Console class
        // only works if you run this program in cmd/terminal through
        Console in = System.console();
        String user_name = in.readLine("Enter user name: ");
        char[] pass = in.readPassword("Enter the password: ");
    }

    // using scanner class
    public void take_input_via_scanner(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.println("Username: " + userName);

        int age = sc.nextInt(); //to read integer value from console
        float marks = sc.nextFloat();
        double my_double = sc.nextDouble();
    }
}
