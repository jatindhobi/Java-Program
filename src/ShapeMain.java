class Shape{
    private String color;

    public Shape(String color){
        this.color=color;
    }
    public void displaycolor(){
        System.out.println("Color: "+color);
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    public void displayArea(){
        double pi=3.14;
        System.out.println("Area of Circle: "+pi*(radius*radius));
    }
} 

class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String color,double length,double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    public void displayArea(){
        System.out.println("Area of Rectangle :"+length*width);
    }
}

public class ShapeMain {
    public static void main(String[]args){
        Circle area=new Circle("Red",5);
        Rectangle Area=new Rectangle("Red",5,4);

        area.displayArea();
        Area.displayArea();
    }
}