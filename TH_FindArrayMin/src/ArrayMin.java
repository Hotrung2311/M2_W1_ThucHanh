public class ArrayMin {
    public static void main(String[] args) {
        int[] a = new int[] {9,2,3,4,5,6,7};
        findMin(a);
        System.out.println(findMin(a));
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
