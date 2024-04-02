import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayintolist {
    public static void main(String[]args) {
        List<String> allStates = Arrays.asList("Delaware", "New Jersey", "New York");
        ArrayList<String> usa = new ArrayList<>(allStates);

        System.out.println(usa);
        System.out.println("First State : " + usa.get(0));
        System.out.println("Second State : " + usa.get(1));
        System.out.println("Third State : " + usa.get(usa.size() - 1));
    }
}
