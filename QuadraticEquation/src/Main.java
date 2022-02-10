import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a");
        Scanner inputA = new Scanner(System.in);
        double a = inputA.nextDouble();

        System.out.println("Enter b");
        Scanner inputB = new Scanner(System.in);
        double b = inputB.nextDouble();

        System.out.println("Enter c");
        Scanner inputC = new Scanner(System.in);
        double c = inputC.nextDouble();

        QuadraticEquation fx1 = new QuadraticEquation(a,b,c);
        System.out.println("The equation is: " + fx1.getA() + "x2" + " + " + fx1.getB() + "x" + " + " + fx1.getC() + " = " + "0");
        if (fx1.getDiscriminant() < 0) {
            System.out.println("The equation has no real roosts");
        } if (fx1.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + fx1.getRoot1());
        } else {
            System.out.println("The equation has two roots: " + fx1.getRoot1() +" and " + fx1.getRoot2());
        }
    }

}
