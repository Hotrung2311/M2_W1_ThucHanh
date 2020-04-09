public class CountChar {
    public static void main(String[] args) {
        String a = "Hello Nobita, Hello Doraemon";
        countChar(a, "H");
    }
    public static void countChar(String a, String b){
        String[] stringArr = a.split("");
        int sum = 0;
        for (int i = 0; i<stringArr.length; i++){
            if(stringArr[i].equals(b)){
                sum++;
            }
        }
        System.out.println("Số lượng ký tự " + b + " trong chuỗi là: " + sum);
    }
}
