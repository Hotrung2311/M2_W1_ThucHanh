import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] b = new int[] {0,1,2,3,4,5,6,7,8,9};
        insertElement(b,10,4);
    }
    public static void insertElement (int[] a, int index, int value){
        int size = a.length + 1;
        int[] result = new int[size];
        for (int i = 0; i < index; i++){
            result[i] = a[i];
        }
        result[index] = value;
        for (int i = index + 1; i < size; i++){
            result[i] = a[i-1];
        }
        System.out.println("Kết quả: " + Arrays.toString(result));
    }
}
