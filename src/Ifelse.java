import java.util.*;

public class Ifelse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Water Level:");
        int water_level=sc.nextInt();
        if(water_level>80){
            System.out.println("Drain water.");
        }
        else {
            System.out.println("Continue Using Water.");
        }
    }
}
