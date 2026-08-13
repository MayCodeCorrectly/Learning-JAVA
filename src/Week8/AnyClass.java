package Week8;
import java.util.logging.*;;


public class AnyClass {
    
    private static final Logger log = Logger.getGlobal();

    // static block -> it gets executed even before ths constructor is called
    static{
        log.setLevel(Level.FINE); 
    }
}
