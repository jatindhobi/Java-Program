class Vehicle {
    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle(String make, String color, int year, String model){
        this.make=make;
        this.color=color;
        this.year=year;
        this.model=model;
    }

    public void printDetails(){
        System.out.println("Manufacture: "+make);
        System.out.println("Color: "+color);
        System.out.println("Year: "+year);
        System.out.println("Model: "+model);
    }
}
class Car extends Vehicle{
    private String bodystyle;
    public Car(String make, String color, int year, String model, String bodystyle){
        super(make,color,year,model); //calling the parent class
        this.bodystyle=bodystyle;
    }
    public void carDetails(){
        printDetails();
        System.out.println("Body Style: "+bodystyle);
    }
}

public class Superclass{
    public static void main(String[]args){
        Car elantra=new Car("Hyundai","Red",2019,"Elantra","Sedan");
        elantra.carDetails();
    }
}