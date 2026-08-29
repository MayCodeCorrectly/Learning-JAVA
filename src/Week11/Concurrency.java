package Week11;

public class Concurrency extends Thread {
    private static int id;
    private int pid;

    public Concurrency(){
        pid = id++;
    }

    @Override
    public void run() {
        // super.run();
        try {
            sleep(2000);
            System.out.println("Thread executed, id: "+ pid);
        } catch (InterruptedException e) {
            System.out.println("An interruption happened!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting the program");
        Concurrency c1 = new Concurrency();
        c1.start(); // swap them to see difference
        // c1.run(); // c.run() and c.start() they don not serve same purpose

        // start creates new tread where as run is just normal method call 
        // start runs the program parallel  

        Concurrency c2 = new Concurrency();
        c2.start();

        // both c1 and c2 will execute simultaneously
    }
}

class ConcurrentInterface implements Runnable{
    private int pid;
    private static int counter;
    
    public ConcurrentInterface(){
        this.pid = counter++;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread "+pid+" got executed!!");
            
        } catch (Exception e) {
            System.out.println("Error happen");
        }
        
    }

    public static void main(String[] args) {
        ConcurrentInterface ci1 = new ConcurrentInterface();
        ConcurrentInterface ci2 = new ConcurrentInterface();

        System.out.println("Program Start");
        new Thread(ci1).start();
        new Thread(ci2).start(); // both of them executed simultaneously
        
        System.out.println("Program End"); // not what you expected, right?
    }
}

class Test extends Thread{
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.getName()+ " "+ t1.getPriority());

        Test t2 = new Test();
        System.out.println(t2.getName() +" "+ t2.getPriority());

        Test t3 = new Test();
        System.out.println(t3.getName() +" "+ t3.getPriority());

        t1.start();
        t1.start(); // exception
    }
}