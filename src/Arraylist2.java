import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist2 {
    public static void main(String[]args) {
        ArrayList<String> usa_before = new ArrayList<>(Arrays.asList("Delaware", "New Jersey", "New York"));

        List<String> usa_after=Arrays.asList("Nevada", "New Mexico", "Idaho");
        System.out.println("States of USA before : "+usa_before);
        System.out.println("After of USA before : "+usa_after);
        usa_before.addAll(usa_after);
        System.out.println("All States of USA : "+usa_before);
    }
}