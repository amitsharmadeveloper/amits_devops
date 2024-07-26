import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public String getRoots() {
        double discriminant = getDiscriminant();
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "The equation has two real and distinct roots: " + root1 + " and " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "The equation has one real and repeated root: " + root;
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            return "The equation has two complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i";
        }
    }
}

class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient a cannot be zero for a quadratic equation.");
            return;
        }

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant (D) = " + equation.getDiscriminant());
        System.out.println(equation.getRoots());
    }
}