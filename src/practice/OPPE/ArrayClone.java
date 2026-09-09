package practice.OPPE;

import java.util.*;

public class ArrayClone {

    String[] sArr;
    public ArrayClone(String[] cArr){
        sArr = (String[]) cArr.clone();
    }

    public static void main(String[] args) {
        String[] names = {"Sandeep", "Aniket", "Abhay", "Harsh"};
        ArrayClone ac = new ArrayClone(names);
        ac.sArr[0] = "Devraj";
        for(int i=0; i< 4; i++){
            System.out.println("Original array: "+names[i]+", Copy array: "+ac.sArr[i] );
        }
    }
}