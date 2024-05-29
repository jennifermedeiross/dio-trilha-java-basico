import entities.Stock;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        boolean running = true;
        int count = 0;
        Stock stock = new Stock();

        System.out.println("--- WELCOME TO STOCK MANAGEMENT ---");
        while(running){
            printOptions(count);

            int input = sc.nextInt();
            if(input == 0) break;

            if(input == 1){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("PRICE: ");
                double price = sc.nextDouble();

                System.out.print("QUANTITY: ");
                int quantity = sc.nextInt();

                Product product = new Product(name, price, quantity);
                stock.addProduct(product);
                System.out.println(">>>>> PRODUCT ADDED SUCCESSFULLY!");
                System.out.println();
            }
            else if (count > 0) stock.print();
            else System.out.println("XXX INVALID OPTION XXX");
            System.out.println();
            count ++;
        }
    }

    public static void printOptions(int count){
        System.out.println("[1] Add Product");
        if (count > 0) System.out.println("[2] View Stock");
        System.out.println("[0] EXIT");
    }
}
