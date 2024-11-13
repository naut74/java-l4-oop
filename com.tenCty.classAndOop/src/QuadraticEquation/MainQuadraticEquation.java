package QuadraticEquation;
import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("\nThe equation has 1 root: " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("\nThe equation has 2 roots: Root 1 = " + quadraticEquation.getRoot1() + " , Root 2 = " + quadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
