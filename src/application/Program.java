package application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of the triangle x: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the measures of the triangle y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Area of triangle X: %.4f%n", areaX);
        System.out.printf("Area of triangle X: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area is the triangle X");
        } else {
            System.out.println("Larger area is the triangle Y");
        }
        scan.close();
    }
}
