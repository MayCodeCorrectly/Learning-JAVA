package practice.OPPE;

import java.io.Serializable;

class Animal implements Serializable{
    String category;
    String name;
    double weight;
    static final int MaxLife = 100;

    public Animal(String c, String n, double w){
        category = c;
        name = n;
        weight = w;
    }
}

public class SeAndDe{
    public static void main(String[] args) {
        
    }
}
