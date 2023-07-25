import java.util.*;
public class Menudriven {

    public static void factorial(int n1) {

        int fact=1;
        for(int i=1;i<=n1;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);;
    }

    public static void main(String[]args){
        System.out.println("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();

        factorial(n1);
    }

}

