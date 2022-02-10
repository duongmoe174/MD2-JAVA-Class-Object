import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputWidth = new Scanner(System.in);
        System.out.println("Enter the width of rectangle");
        double width = inputWidth.nextDouble();
        Scanner inputHeight = new Scanner(System.in);
        System.out.println("Enter the height of rectangle");
        double heigth = inputHeight.nextDouble();

        Rectangle newRectangle = new Rectangle(width, heigth);

        System.out.println("This rectangle " + newRectangle.display());
        System.out.println("The area " + newRectangle.getArea());
        System.out.println("The perimeter" + newRectangle.getPerimeter());
    }
}
