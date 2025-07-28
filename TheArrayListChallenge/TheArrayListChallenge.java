import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TheArrayListChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("""
                    Hello %s,
                    
                    0: Shut down
                    1: Add item(s) to your list (comma separated)
                    2: Remove any items (comma separated)
                    
                    Enter a number for which action you want to do!
                    """.formatted(name));
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine();
                if (option == 0) {
                    System.out.println("Goodbye!");
                    break;
                } else if (option == 1) {
                    System.out.println("What item(s) do you want to add?");
                    String [] items = scanner.nextLine().split(",");
                    for (String item : items) {
                        item = item.trim();
                        if (groceryList.contains(item)) {
                            System.out.println("You already picked \"" + item + "\"!");
                        } else {
                            groceryList.add(item.trim());
                        }
                        groceryList.sort(Comparator.naturalOrder());
                        System.out.println("Your items are: " + groceryList + "\n----------\n");
                    }
                } else if (option == 2) {
                    System.out.println("What item(s) do you want to remove?");
                    String [] items = scanner.nextLine().split(",");
                    for (String item : items) {
                        item = item.trim();
                        if (groceryList.contains(item)) {
                            groceryList.remove(item);
                        } else {
                            System.out.println("You didn't pick the item: \"" + item + "\"!");
                        }
                        groceryList.sort(Comparator.naturalOrder());
                        System.out.println("Your items are: " + groceryList + "\n----------\n");
                    }
                } else {
                    System.out.println("Wrong option!\n----------\n");
                }
            } else {
                String invalid = scanner.next();
                System.out.println("Wrong input: \"" + invalid + "\"! Please type: 1, 2 or 0!\n----------");
            }
        }
        scanner.close();
    }
}
