import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rect = new Rectangle(width,height);

        System.out.println("Your Rectangle \n"+ rect.display());
        System.out.println("Perimeter of the Rectangle: "+ rect.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rect.getArea());
    }
}
