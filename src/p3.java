class Lion{
    private String name;
    private int age;
    private String gender;

    public Lion(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void roar(){
        System.out.println(name+" roars loudly.");
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
}
public class p3{
    public static void main(String[]args){
        Lion simba=new Lion("simba",5,"male");
        simba.roar();
        simba.sleep();
        simba.eat("meat");
    }
}

