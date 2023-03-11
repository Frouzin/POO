package Application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scan.nextLine();
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("quantatity in stock: ");
        product.quantity = scan.nextInt();
        System.out.println();
        System.out.println("Product data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: "+product);
        System.out.println();

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: "+product);


        scan.close();
    }
}
