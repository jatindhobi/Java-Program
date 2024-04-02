import java.util.ArrayList;

public class Arraylisst1 {
    public static void main(String[]args){
        //Output
        ArrayList<String> usa=new ArrayList<>();
        usa.add("New Mexico");
        usa.add("delaware");
        usa.add("New Jersey");
        System.out.println(usa);
        System.out.println("First State : "+usa.get(0));
        System.out.println("Second State : "+usa.get(1));
        System.out.println("Third State : "+usa.get(usa.size() -1));
    }
}
