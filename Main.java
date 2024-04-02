import java.util.*;
public class Main {
    public static void main(String[]args){
        int my_number=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int user_number;

        do{
            System.out.println("Guess The Number(1-100)");
            user_number=sc.nextInt();

            if (user_number>100){
                System.out.println("Give Number Between 1-100.");
            }
            else if(user_number==my_number){
                System.out.println("Correct Answer.");
                break;
            }
            else if (user_number>my_number) {
                System.out.println("Your Number Is Large.");
            }
            else {
                System.out.println("Your Number Is Small");
            }
        }while (user_number>=0);


    }
}