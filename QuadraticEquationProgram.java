package homework;

public class QuadraticEquationProgram {
    public static void main(String[] args) {
        double a = 14.0;
        double b = 8.0;
        double c = 1.0;


        calculateAndPrintRoots(0.0, 78.0, 12.0);
        calculateAndPrintRoots(0.0, 0.0, 0.0);
        calculateAndPrintRoots(0.0, 0.0, 12.0);
        calculateAndPrintRoots(a, b, c);

    }

    private static void calculateAndPrintRoots(double a, double b, double c) {
        double d = Math.pow(b,2)-4*a*c;
        double x1;
        double x2;
        double x;

        if (Double.compare(a, 0) == 0) {
            x= (-c/b);
            System.out.println("Simplified calculation. One root:" + x);
        } else if (Double.compare(d, 0) == -1) {

            System.out.println("No roots:");

        } else if (Double.compare(d, 0) == 0) {
            x1 = (-b + Math.sqrt (d) / (2 * a));
            System.out.println("discriminant equals zero.One root:" + x1);
        } else {
            x1 = (-b + Math.sqrt (d) / (2 * a));
            x2 = (-b - Math.sqrt (d)/ (2 * a));
            System.out.println("Two roots:" + x1 + ";" + x2);

        }
    }
}
