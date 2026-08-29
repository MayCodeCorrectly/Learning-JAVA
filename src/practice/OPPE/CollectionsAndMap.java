package practice.OPPE;
import java.util.*;

public class CollectionsAndMap {
    
    public static void main(String[] args) {
        
        Map<String,Integer> Scores = new HashMap<>();
        Scores.put("Alex", 90);
        
        // System.out.println(Scores.put("Alex", 90));
        // System.out.println(Scores);

        for(Map.Entry<String,Integer> e : Scores.entrySet()){
            e.getKey(); e.getValue(); // to access those values and keys in each iteration
        }

        // Duplication key?
        Map<Employee,Integer> CompanyData = new HashMap<>();
        CompanyData.put(new Employee("Ritik"),90000);
        CompanyData.put(new Employee("Ritik"),100000);
        
        System.out.println(CompanyData);
    }
}

class Employee implements Comparable<Employee> {
    String name;
    public Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " +name;
    }
    
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee Pobj = (Employee) obj;
            if(this.name.equals(Pobj.name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

}