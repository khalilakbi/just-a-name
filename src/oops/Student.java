package oops;

public class Student {
    // fields (variable)
   int id;
   String name;

   // methods
    public void write(){
        System.out.println("student is writing");
    }
    public void getName(){
        System.out.println("student name is " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 18;
        student.name = "nassiba";
        student.write();
    }

}
