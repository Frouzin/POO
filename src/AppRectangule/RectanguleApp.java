package AppRectangule;

import RectangleArea.RectangleObject;

import java.util.Locale;
import java.util.Scanner;

public class RectanguleApp {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        RectangleObject rect = new RectangleObject();

        System.out.println("Enter rectangule width and heigth: ");
        rect.width = scan.nextDouble();
        rect.height = scan.nextDouble();

        System.out.printf("Area: %.2f%n", rect.areaRectangule());
        System.out.printf("Perimeter: %.2f%n", rect.perimeterRectangule());
        System.out.printf("Diagonal: %.2f%n", rect.diagonalRectangule());

        scan.close();

    }
}
