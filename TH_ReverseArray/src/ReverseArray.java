import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Khai báo, nhập và kiểm tra kích thước mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử mảng:");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        // Nhập giá trị cho các phần tử mảng
        for (int i = 0; i<arrayLength; i++){
            System.out.print("Phần tử [" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // In ra mảng đã nhập
        System.out.print("Mảng vừa nhập: [ ");
        for (int i = 0; i<arrayLength; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        // Đảo ngược thứ tự các phần tử trong mảng
        int temp = 0;
            if (arrayLength % 2 == 0){
                for (int i = 0; i<arrayLength/2; i++) {
                    temp = arr[i];
                    arr[i] = arr[arrayLength - 1 - i];
                    arr[arrayLength - 1 - i] = temp;
                }
            }else {
                for (int i = 0; i<(arrayLength-1)/2; i++) {
                    temp = arr[i];
                    arr[i] = arr[arrayLength - 1 - i];
                    arr[arrayLength - 1 - i] = temp;
                }
            }

        // In ra mảng sau khi đảo ngược
        System.out.print("Mảng đảo ngược: [ ");
        for (int i = 0; i<arrayLength; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}
