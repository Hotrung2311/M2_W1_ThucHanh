import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Phần tử max có giá trị: " + max);
    }
}
