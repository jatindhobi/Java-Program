import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = n1 * i;
            System.out.println(n1 + "X" + i + "=" + table);
        }
    }
}