import java.util.ArrayList;
public class Arraylist {
    public static void main(String[]args){
        ArrayList<String> shoppingList=new ArrayList<>();

        shoppingList.add("Apples");
        shoppingList.add("Bananas");
        shoppingList.add("Chocolates");

        //get the value of list
        String firstItem=shoppingList.get(0);
        System.out.println("First Item:"+firstItem);

        //remove item from list
        shoppingList.remove(2);

        //get the size of list
        int listsize=shoppingList.size();
        System.out.println("Size:"+listsize);

        //to check the item is in list or not
        boolean hasapples=shoppingList.contains("Apples");
        System.out.println("Do we have apples? "+hasapples);

        //to get all the value of list
        for(String item:shoppingList){
            System.out.println(item);
        }

    }
}
