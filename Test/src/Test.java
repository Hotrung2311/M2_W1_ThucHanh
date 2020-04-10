public class Test {
    public static void main(String[] args) {
        Hello hello1 = new Hello("Trung");
        hello1.method();
    }
    public static class Hello {
        String name;
        Hello(){
            name = "Trung";
        }
        Hello(String a){
            name = a;
        }
        void method() {
            System.out.println("Hello Nobita");
            System.out.println(name);
        }

        void method(int x) {
            System.out.println("Hello Doraemon");
        }


        void method(float x) {
            System.out.println("Hello Xuka's mom");
        }

        void method(int x, double y) {
            System.out.println("Hello Xuka");
        }
    }
}
