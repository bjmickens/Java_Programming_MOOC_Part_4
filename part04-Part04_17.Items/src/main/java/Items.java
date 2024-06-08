
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        while (!(name.equals(""))) {
            items.add(new Item(name));
            name = scanner.nextLine();
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
