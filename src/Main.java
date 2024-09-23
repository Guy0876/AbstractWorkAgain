import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float side, radius, width, length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your side: ");
        side = sc.nextFloat();
        square squ = new square(side);
        System.out.print("Enter your radius: ");
        radius = sc.nextFloat();
        circle circ = new circle(radius);
        System.out.print("Enter your width: ");
        width = sc.nextFloat();
        System.out.print("Enter your length: ");
        length = sc.nextFloat();
        rectangle rect = new rectangle(length, width);
        System.out.print("Circle perimiter is: " + circ.calculatePerimiter()
                + " Circle Area is: " + circ.calculateArea()
                + " square perimiter is: " + squ.calculatePerimiter()
                + " square Area is: " + squ.calculateArea()
                + " Rectangle perimiter is: " + rect.calculatePerimiter()
                + " Rectangle Area is: " + rect.calculateArea());
    }
}