package Week3;

class Person{

    private String name, voter_id;
    private int age;
    private boolean isAdult, isIndian;

    //default constructor
    Person(){
        //pass
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
        if(this.age>=18){
            this.isAdult = true;
        }
    }

    Person(String name,int age,boolean isIndian,String voter_id){
//          Person(name,age);
        // we can not to above thing can not call constructor of same class inside constructor of same class
        this.name = name;
        this.age =age;
        if (age>=18) isAdult = true;

        this.isIndian  = isIndian;
        if(this.isIndian && this.isAdult){
            this.voter_id = voter_id;
        }
    }

    // copy constructor
    // it makes a proper new object/copy of passed object
    Person(Person P){
        this.name = P.name;
        this.age = P.age;
        // and so on
    }

    @Override
    public String toString(){
//        System.out.println("ok");
        return  "Name of person is "+name+" and Age of the person is "+age;
    }
}

class Test{
    static void main(String[] args) {

        Person a = new Person("Alex",28);
        Person b = new Person(a);

        System.out.println(a);
        System.out.println(b);

    }
}
