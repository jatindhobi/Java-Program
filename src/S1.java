class Student{
    private String name;
    private int age;
    private int rollnumber;

    public Student(String name,int age,int rollnumber){
        this.name=name;
        this.age=age;
        this.rollnumber=rollnumber;
    }
    public void disp(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll No:"+rollnumber);
    }
}

public class S1{
    public static void main(String[]args){
        Student id=new Student("Jatin",19,27);
        id.disp();
    }
}