package week5.generic_methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Show{
    <S> Show(S[] element1){
        for(S ele:element1){
            System.out.println(ele);
        }
        System.out.println();
    }

    <S,T> Show(S[] ele1, T[] ele2){
        for(S ele:ele1) System.out.println(ele);
        for(T ele:ele2) System.out.println(ele);
        System.out.println();
    }
}


public class generic_func {
    static void main(String[] args) {
        Character[] arr1 = {'A','B','C','D'};
        Integer[] arr2 = {1,2,3,4,5};
        String[] arr3 = {"Alex","Bob","Charlie","Ela"};

        Show obj1 = new Show(arr1);
        Show obj2 = new Show(arr2,arr3);

        String name  = obj1.getClass().getSimpleName();
        System.out.println(name);

        Animal a= new Dog("Spike");
        Dog d = new Dog("Tom");

        if(d.getClass() == a.getClass()){
            System.out.println("Yes it is!!");
        }

//        int number = (Integer) "10";
//        String num = (String) 10;
        int x = 10;
//        System.out.println(x.getClass()); // Since int primitive it does not have class associated with it
        Integer y =10;
        System.out.println(y.getClass());

        Class c = d.getClass();
        Constructor[] c_constructor  = c.getConstructors();
        Method[] c_methods = c.getMethods();
    }
}


class Animal{
    private String name;
    Animal(String n){
        name = n;
    }

}
class Dog extends Animal{
    Dog(String n){
        super(n);
    }
}
