import java.util.*;
public class Stringtolist {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give me everybody's names, separated by a comma:");
        String names=sc.nextLine();
        String[] nameArray=names.split(", ");
        List<String> nameList = Arrays.asList(nameArray);

        System.out.println(nameList);

        Random random=new Random();
        String who=nameList.get(random.nextInt(nameList.size()));
        System.out.println(who+" is going to pay the bill");
    }
}
