import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordList word = new WordList();
        int c = 0;
        String item;
        int index;
        do {
            System.out.print("1. Insert\n"+
                               "2. Search\n"+
                               "3. Delete\n"+
                               "4. Display\n"+
                               "5 Exit\n"+
                               "Enter your choice: ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    sc.nextLine();
                    if (word.insert(sc.nextLine())) {
                        System.out.println("Inserted successfully");
                        System.out.println();
                    }else {
                        System.out.println("Item is already in the list");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter the item to search: ");
                    sc.nextLine();
                    if (word.search(sc.nextLine())) {
                        System.out.println("Item found in the list.");
                        System.out.println();
                    } else {
                        System.out.println("Item not found in the list.");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter the item to delete: ");
                    sc.nextLine();
                    if (word.delete(sc.nextLine())) {
                        System.out.println("Deleted successfully.");
                        System.out.println();
                    } else {
                        System.out.println("Item does not exist.");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("The Items in the list are:");
                    word.display();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Application closed");
                    break;
                default:
                    System.out.println("Please insert a valid option");
                    System.out.println();
                    break;
            }
        } while (c != 5);

    }

}
