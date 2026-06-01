package Week3;

public class Instance {
    static  void main(){

        Employee e1 = new Manager("Colin",45000);
        // now I want to cast e1 to manager to set Sec name
//        ((Manager) e1).setSec("Mary");

        // but what if casting is not valid here what if e1 was actually emp instead of manager?
        // so the casting will fail at run-time not compile-time
        if(e1 instanceof  Manager){
            // this cheks type of object at run-time => instanceof
            ((Manager) e1).setSec("Mary");
        }

    }
}
