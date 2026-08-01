package Week4.Composition_Aggregation;

// The following code has circular dependency
// to create heart you need Animal and to create animal u need heart

//class Animal {
//    int age;
//    String name;
//    Heart hh;
//
//    Animal(int a,String n,Heart h){
//        age= a;
//        name =n;
//        hh = h;
//    }
//
//    class Heart{
//        private int heart_health;
//
//        Heart(int h){
//            setHeart_health(h);
//        }
//
//        public void setHeart_health(int heart_health) {
//            if(heart_health>=0 && heart_health<=100)
//                this.heart_health = heart_health;
//            else
//                System.out.println("Not valid health");
//        }
//    }
//}

class Animal {
    int age;
    String name;
    Heart heart;

    Animal(int a, String n, int health) {
        age = a;
        name = n;
        heart = new Heart(health);
    }

    class Heart {
        private int heart_health;

        Heart(int h) {
            setHeart_health(h);
        }

        public void setHeart_health(int heart_health) {
            if (heart_health >= 0 && heart_health <= 100)
                this.heart_health = heart_health;
            else
                System.out.println("Not valid health");
        }
    }
}

public class Test{
    static void main(String[] args) {
        Animal a = new Animal(12,"Dog",100);
//        Animal.Heart h_obj = new Animal.Heart(99);
    }
}
