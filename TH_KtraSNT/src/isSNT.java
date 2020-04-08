import java.util.Scanner;

public class isSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiểm tra số nguyên tố");
        System.out.println("Nhập vào 1 số nguyên dương:");
        int number = scanner.nextInt();

        if (number < 2){
            System.out.println("Kết quả: " + number + " không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            for (i = 2; i <= number/2; i++){
                if (number == 2){
                    check = true;
                }
                if (number % i == 0){
                    check = false;
//                    System.out.println("Kết quả: " + number + " không phải là số nguyên tố");
                }else {
//                    System.out.println("Kết quả: " + number + " không phải là số nguyên tố");
                    check = true;
                }
            }
            if (check){
                System.out.println("Kết quả: " + number + " là số nguyên tố");
            }else {
                System.out.println("Kết quả: " + number + " không phải là số nguyên tố");
            }
        }
    }
}
