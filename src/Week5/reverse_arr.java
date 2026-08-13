package week5;

public class reverse_arr {
    static void main(String[] args) {
        String[] names = {"Sandeep","Aniket","Ritesh","Abhay","Harsh"};
        rev_arr(names);
        for(String n:names){
            System.out.println(n);
        }
    }

    public static void rev_arr(Object[] obj){
        int len = obj.length;
        for(int i =0;i<len/2;i++){
            Object temp = obj[i];
            obj[i] = obj[(len-1)-i];
            obj[(len-1)-i] = temp;
        }
    }
}
