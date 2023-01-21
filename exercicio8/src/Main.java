import model.Store;
import model.User;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Store> items = new ArrayList<Store>();

        User user = new User();
        User pass = new User();

        Scanner scanner = new Scanner(System.in);

        System.out.println("User: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        while(!(user.getUser().equals(username) && pass.getPass().equals(password))){
            System.out.println("Insira os dados novamente.");
            System.out.println("User: ");
            username = scanner.nextLine();
            System.out.println("Password: ");
            password = scanner.nextLine();
        }

        while(true){
            System.out.println("Welcome to Electronic Nerd Store");
            System.out.println("1. Add new item: ");
            System.out.println("2. List all items: ");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            if(option != 3){
                switch (option){

                    case 1:
                        System.out.println("Item: ");
                        String item = scanner.nextLine();
                        System.out.println("Price: ");
                        float price = Float.parseFloat(scanner.nextLine());
                        items.add(new Store(item, price));
                        System.out.println("\n");
                        break;

                    case 2:
                        System.out.println("Our items: " + items + "\n");
                        break;

                    default:
                        System.out.println("Invalid option" + "\n");
                        break;
                }

            }
            else {
                System.out.println("See you next time! ");
                return;
            }
        }

    }
}