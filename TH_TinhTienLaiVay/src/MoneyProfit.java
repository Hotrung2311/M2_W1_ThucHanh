import java.util.Scanner;

public class MoneyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double money = 1.0;
         int month = 1;
         double interest_rate = 1.0;

        System.out.println("Enter interestment amount (Nhập số tiền gửi):");
        money = scanner.nextDouble();

        System.out.println("Enter number of months (Nhập số tháng gửi):");
        month = scanner.nextInt();

        double total_interest = 1.0;
        for(int i = 0; i < month; i++){
            total_interest = money * (interest_rate/100)/12 * 3;
        }

        System.out.println(total_interest);
    }
}
