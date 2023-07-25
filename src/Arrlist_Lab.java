
/** 1.we have to import arrayist class and scanner class
    2.crate a class name operation
    3.create one integer arraylist
    4.create an object for scanner class
    5.show a menu for 1.add number to the  arraylist
                      2.remove a number from arraylist
                      3.display the list
                      4.calculate the sum of all number of arraylist
                      5.calculate the average
                      6.exit
    6.use switch or do-while
**/
import java.util.Scanner;
import java.util.ArrayList;

class operation {

}

public class Arrlist_Lab {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();

        do {
            System.out.println("1.Add Number to the Array List");
            System.out.println("2.Remove Number");
            System.out.println("3.Display List");
            System.out.println("4.Calculate The sum of all nummbers");
            System.out.println("5.Calculate Average");
            System.out.println("6.exit");
            int option = sc.nextInt();
            if (option == 6) {
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("Enter the size of Arraylist:");
                    int size = sc.nextInt();
                    System.out.println("Add Number :");
                    for (int i = 0; i < size; i++) {
                        int number = sc.nextInt();
                        li.add(number);
                    }
                    System.out.println(li);
                    break;
                case 2:
                    System.out.println("Enter index:");
                    int index = sc.nextInt();
                    li.remove(index);
                    break;
                case 3:
                    System.out.println(li);
                    break;
                case 4:
                    for (int element : li) {
                        sum = sum + element;
                    }
                    System.out.println(sum);
                case 5:
                    for (int element : li) {
                        sum = sum + element;
                    }
                    double average = sum / li.size();
                    System.out.println("Average :" + average);
                default:
                    System.out.println("Enter valid option.\n");
            }
        } while (true);
    }
}
