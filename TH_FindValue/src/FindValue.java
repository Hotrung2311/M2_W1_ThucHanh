import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        // Khai báo mảng chứa danh sách sinh viên
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Camila" ,"Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        // Khai báo biến lưu tên tìm kiếm và  gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String name = scanner.nextLine();

        // Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        boolean isExsist = false;
        for (int i = 0; i < students.length; i++){
            if (name.equals(students[i])){
                System.out.println("Position of the student " + name + " in the list is: " + (i + 1));
                isExsist = true;
            }
        }
        if (isExsist == false){
            System.out.println("Not found students " + name + " in the list.");
        }
    }
}
