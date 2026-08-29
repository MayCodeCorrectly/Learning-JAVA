package Week11;

import java.util.concurrent.locks.*;

class DemoLock{
    ReentrantLock lck=new ReentrantLock();
    public void display(String name){
        // lck.lock(); // this extra lock will keep process starved
        lck.lock(); 
        try{
            for(int i=1;i<4;i++){
                System.out.print(i+":"+name+" ");
            }
            System.out.print("\n");
        }
        finally{
            lck.unlock();
        }
    }
}

class Example extends Thread{
    DemoLock obj;
    String str;
    Example(DemoLock obj, String str){
        this.obj=obj;
        this.str=str;
    }
    public void run(){
        obj.display(str);
    }
}

public class Locks{
    public static void main(String[] args){
        DemoLock obj=new DemoLock();
        Example e1=new Example(obj, "Sun");
        Example e2=new Example(obj, "Moon");
        Example e3=new Example(obj, "Earth");
        e1.start();
        e2.start();
        e3.start();
    }
}