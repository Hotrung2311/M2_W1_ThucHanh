import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        deleteElement(arr, 3);
    }
    public static void deleteElement(int[] a, int x){
        if (x > a.length){
            System.out.println("Mảng không chứa phần tử " + x);
            return;
        }
        int[] result = new int[a.length - 1];
        for (int i = 0; i < x; i++){
            result[i] = a[i];
        }
        for (int i = x; i <result.length; i++){
            result[i] = a[i+1];
        }
        System.out.println(Arrays.toString(result));
    }
}
