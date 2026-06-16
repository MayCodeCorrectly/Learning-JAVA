package practice.week2.Strings;

public class Strings_Intro {
    static void main(String[] args) {
        String s1 = "Taj Mahal";
        String s2 = s1; // deep copy ? No
        // both s1 and s2 points at same memory location

        System.out.println(s1 == s2);      // true
        System.out.println(s1.equals(s2)); // true

        System.out.println("String 1 is "+s1);
        System.out.println("String 2 is "+s2);

        s1 = "Ram Mandir";
        // why did this happen?

        System.out.println("Changed String 1 to "+s1);
        System.out.println("Value of String 2 is "+s2);

        /*
        ====================== Explanation ===============================
        let s1 was pointing to 0xff10 memory location
        which has value "Taj Mahal"
        And s2 is pointing to the memory location of s1 ==> s2 pointing to 0xff10 (has value "Taj Mahal")

        Now what we do change the string value =>
        But what actually happens it we change the memory location to which s1 was pointing to
        s1 points to 0x10aa which is different memory location which contains value "Ram Mandir"
        and s2 still points to older memory location
        so value at s1 ==> "Ram Mandir"
        whereas value at s2 ==> "Taj Mahal"
         */

        // want deep copy?
        String x = "XYZ";
        String y = new String(x);

        //check
        System.out.println(x == y);      // false
        System.out.println(x.equals(y)); // true
    }
}
