package Week3;

public class Hierarchy {
    static void main(){
        // there is superclass which sits over all classes in java called "Object"
        // each class inherits from it implicitly

        // that class has two methods init
        // 1. public boolean equals(Object o) =>
        // this returns whether two objects are pointing at the same memory location or not
        // 2. public String toString()=>
        // converts instance variables to string

        String s1 = new String("Hi");
        String s2 = new String("Hi");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);  // == checks if both var's point to same memory location or not

        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);

        int a = 10;
        int b = 10;
        System.out.println(a==b);
//        System.out.println(a.equals(b)); // int is not an object

        Object c = new Integer(10);
        Object d = new Integer(10);

        System.out.println(c.equals(d));
        System.out.println(c==d);

        // .equals => cheks content by default unless overridden
        // and == => checks memory reference

        // they are same if class has not overridden that method
    }

    public int find(Object[] obj_arr,Object o){
        for(int i=0;i<obj_arr.length;i++){
            if (obj_arr[i]==o) return i;
        }
        return -1;
    }




}
