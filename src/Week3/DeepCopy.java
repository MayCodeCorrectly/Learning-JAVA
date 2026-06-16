package Week3;

class Roll_Marks{
    private int stu_id;
    private int[] stu_marks;

    public int[] getStu_marks() {
        return stu_marks;
    }

    public void setStu_marks(int pos,int mark) {
        if (pos<this.stu_marks.length) {
            this.stu_marks[pos] = mark;
        }
        else System.out.println("Index/pos out of range Can't set value");
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    Roll_Marks(int id, int[] marks){
        this.stu_id = id;
        //this.stu_marks = marks;// this is shallow copy

        // make new array of same size and those input value in new array
        int len = marks.length;
        this.stu_marks  = new int[len];
        // array coping
        System.arraycopy(marks, 0, this.stu_marks, 0, len);
    }

    // copy constructor
    Roll_Marks(Roll_Marks obj){
        this.stu_id = obj.stu_id;

        int len = obj.stu_marks.length;
        this.stu_marks = new int[len];
        // array coping
        for(int i=0;i<len;i++){
            this.stu_marks[i] = obj.stu_marks[i];
        }
    }

    // printing
    public String toString(){
        String marks_str= "";
//        for(int i=0;i<this.stu_marks.length;i++) marks_str += stu_marks[i]+" ";  //use enhance for loop
        for(int marks:this.stu_marks){
            marks_str += marks + "";
        }
        return "Student ID is "+this.stu_id+"\nMarks of this student are "+marks_str;
    }
}

class Test_Copy {
    static void main(String[] args) {
        int[] marks = {10,12,13,14};
        Roll_Marks rec1 = new Roll_Marks(1,marks);
        System.out.println(rec1);

        // now lets change the values in original marks array
        marks[2] = 100;
        System.out.println(rec1); // it hasn't changed ==> Deep Copy

        Roll_Marks rec2 = new Roll_Marks(rec1);
        System.out.println(rec2);

        // change value of rec2
        rec2.setStu_id(2);
        rec2.setStu_marks(1,-99);
        System.out.println(rec2);

        // now check rec1 has changed or not
        System.out.println(rec1);
    }
}