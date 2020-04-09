import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double Fahrenheit = 0;
        double Celsius = 0;
        switch (choice){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Fahrenheit to Celsius Converter");
                System.out.println("Enter Fahrenheit: ");
                Fahrenheit = scanner.nextDouble();
                Celsius = (5.0 / 9) * (Fahrenheit - 32);
                System.out.println("Celcius: " + Celsius);
                break;
            case 2:
                System.out.println("Celsius to Fahrenheit Converter");
                System.out.println("Enter Celsius: ");
                Celsius = scanner.nextDouble();
                Fahrenheit = (9.0 / 5) * Celsius + 32;
                System.out.println("Fahrenheit: " + Fahrenheit);
                break;
        }
    }
}
