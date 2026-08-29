package Week9;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Week9.Person;
public class SerializationAndDeserialization {
    
    public static void main(String[] args) {
        
        try {
            var out  = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\sandeep\\Learnings\\Learning-JAVA\\src\\Week9\\peoples.txt")
            );

            var emp = new Person(10, "Sandeep");
            out.writeObject(emp);

            
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
