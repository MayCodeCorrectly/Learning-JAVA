package Week1;

class SingleTon {
    private static SingleTon instance; // initialized to none

    private SingleTon(){
        System.out.println("Object Created");
    }

    public static SingleTon getInstance(){
        if(instance==null){
            instance = new SingleTon();
        }
        return instance;
    }

    //testing
    static void main(String[] args) {
        // make an object
        SingleTon s1 = getInstance();
        // object created

        // make another object
        SingleTon s2 = getInstance();

        System.out.println(s1==s2);
    }
}



