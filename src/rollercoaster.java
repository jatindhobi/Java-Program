import java.util.*;
public class rollercoaster {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Height:");
        int height=sc.nextInt();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        int bill=0;

        if(height>120){
            System.out.println("Can ride.");
            if(age<=12){
                bill=5;
                System.out.println("You need to pay $"+bill);
            }
            else if (age>12 && age<=18) {
                bill=7;
                System.out.println("You need to pay $"+bill);
            }
            else {
                bill=12;
                System.out.println("You need to pay $"+bill);
            }
        }
        else{
            System.out.println("Can't ride.");
        }

        System.out.println("Do you want Photos? y or n");
        String q=sc.next();
        if(q.equalsIgnoreCase("Y")){
            bill+=3;
        }
        System.out.println("The total bill is $"+bill);
    }
}


