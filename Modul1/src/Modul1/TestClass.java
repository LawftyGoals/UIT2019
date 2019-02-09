package Modul1;
import java.util.*;

public class TestClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Side 1? ");
        double side1 = sc.nextDouble();
        System.out.print("Side 2? ");
        double side2 = sc.nextDouble();
        System.out.print("Side 3? ");
        double side3 = sc.nextDouble();

        Triangle tri = new Triangle(side1, side2, side3);

        tri.setColor("Pink");
        tri.setFilled(false);

        System.out.printf("%nArea: %.2f%n", tri.getArea());
        System.out.printf("Perimeter: %.2f%n%n", tri.getPerimeter());

        System.out.println(tri.toString());


    }
}
