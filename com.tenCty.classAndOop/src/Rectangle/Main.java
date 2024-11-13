package Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextInt();
        System.out.print("Enter th height: ");
        double height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle " + rectangle.getArea());
    }
}
