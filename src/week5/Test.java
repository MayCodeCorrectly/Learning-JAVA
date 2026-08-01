package week5;

/*
For below methods
1. <S,T> this is not fine
2. <S,T extends Number> fine
3. <S extends Number,T> fine
4. <S extends Number,T extends Number>  Not fine

 */

class Clone<S ,T extends Number>{
    public void fun(S item){
        System.out.println(item);
    }

    public void fun(T item){
        System.out.println(item);
    }
}

class Repository<T1,T2>{
    T1 item1;
    T2 item2;
    Repository(T1 x,T2 y){
        this.item1=x;
        this.item2=y;
    }
    public T1 getItem1(){
        return item1;
    }
    public T2 getItem2(){
        return item2;
    }
}
public class Test{
    public static void main(String args[]){
//        Repository<String,double> obj=new Repository<String,double>("ABC",5.5);
        Repository<String,Double> obj=new Repository<String,Double>("ABC",5.5);

        System.out.println(obj.getItem1()+"\n"+obj.getItem2());
    }
}