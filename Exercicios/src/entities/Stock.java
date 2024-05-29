package entities;

import java.util.ArrayList;

public class Stock {
    public ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        this.products.add(p);
    }

    public void print(){
        System.out.println("           STOCK");
        for (int i = 0; i < products.size(); i++){
            System.out.println("----------------------------------");
            System.out.println("PRODUCT " + (i + 1));
            System.out.println("Name: " + products.get(i).getName());
            System.out.println("PRICE: " + products.get(i).getPrice());
            System.out.println("QUANTITY: " + products.get(i).getQuantity());
            System.out.println("----------------------------------");
        }
    }
}
