import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // Create an ArrayList to store fruits
        List<String> fruits = new ArrayList<>();

        // Add some fruits to the list
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        // Print the list content
        System.out.println("Fruits: " + fruits);

        // Access an element by index (starting from 0)
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Iterate through the list using a for-each loop
        System.out.println("Fruits (for-each):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element by value
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);
    }
}
