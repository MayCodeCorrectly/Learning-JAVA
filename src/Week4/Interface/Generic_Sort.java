package Week4.Interface;

interface Comparable{
    // it is basically how you are goona compare the objects
    int cmp(Comparable c);// a function which takes comparable reference
    // all the objects which can implement Comparable and be sorted

    void get_details();
}

class Student implements Comparable{
    private String name;
    private int marks;

    public  Student(String n,int m){
        this.name = n;
        this.marks = m;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // now that abstract method cmp
    @Override
    public int cmp(Comparable s){
        Student cpy_s = (Student) s;
        if(this.marks > cpy_s.marks) return 1;
        else if(this.marks < cpy_s.marks) return -1;
        else return 0;
    }

    public void get_details(){
        System.out.println("Student Name: "+name+" Marks: "+marks);
        System.out.println("--------------------------------------");
    }
}

class Worker implements Comparable{
    private String name;
    private double salary;

    public Worker(String n, double s){
        name =n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int cmp(Comparable e){
        Worker cpy_e =(Worker)e;
        if (this.salary> cpy_e.salary) return 1;
        else if (this.salary<cpy_e.salary) return -1;
        else return 0;
    }

    public void get_details(){
        System.out.println("Worker name: "+name+" Salary: "+salary);
        System.out.println("--------------------------------------");
    }
}

class Point implements Comparable{
    private double x=0,y=0;

    public Point(double x_val,double y_val){
        x= x_val;
        y= y_val;
    }

    public void setX(double a){
        x=a;
    }
    public void setY(double b){
        y=b;
    }

    public double disO(){
        double dis_from_origin = Math.pow(Math.pow(Math.abs(x-0.0),2)+Math.pow(Math.abs(y-0.0),2),0.5);
        return dis_from_origin;
    }

    public double eudist(Point p){
        return Math.pow(Math.pow(Math.abs(this.x-p.x),2)+Math.pow(Math.abs(this.y-p.y),2),0.5);
    }

    public int cmp(Comparable p){
        Point cpy_p = (Point)p;
        if(this.disO()> cpy_p.disO()) return 1;
        else if (this.disO()<cpy_p.disO()) return -1;
        else return 0;
    }

    public void get_details(){
        System.out.println("Point: ("+this.x+", "+this.y+")");
    }
}

class SortFunction{
    public static void Sort(Comparable[] c) {
        for (int i = 0; i < c.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < c.length; j++) {
                if (c[minIndex].cmp(c[j]) == 1) {
                    minIndex = j;
                }
            }

            Comparable temp = c[i];
            c[i] = c[minIndex];
            c[minIndex] = temp;
        }

        for (Comparable x : c)
            x.get_details();
        System.out.println("\n\n");
    }
}

public class Generic_Sort {
    public static void main(String[] args) {
        Comparable[] s_arr = new Student[5];
        s_arr[0] = new Student("Aniket",90);
        s_arr[1] = new Student("Abhay",87);
        s_arr[2] = new Student("Ritesh",92);
        s_arr[3] = new Student("Harsh",98);
        s_arr[4] = new Student("Devraj",99);

        SortFunction.Sort(s_arr);

        Comparable[] w_arr = new Worker[5];
        w_arr[0] = new Worker("w1",9878.32);
        w_arr[1] = new Worker("w2",10000);
        w_arr[2] = new Worker("w3",78965.32);
        w_arr[3] = new Worker("w4",74125.36);
        w_arr[4] = new Worker("w5",102563.2);

        SortFunction.Sort(w_arr);

        Comparable[] p_arr = new Point[5];
        p_arr[0] = new Point(0.2,0.8);
        p_arr[1] = new Point(-0.2,-0.8);
        p_arr[2] = new Point(10.6,6.7);
        p_arr[3] = new Point(0,90.8);
        p_arr[4] = new Point(11.2,78.8);

        SortFunction.Sort(p_arr);

        System.out.println(((Point)p_arr[3]).eudist((Point)p_arr[4]));
    }
}
