package exception;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(30 / 0);
        }catch (ArithmeticException e){
            System.out.println("Exception error!");
        }
    }
}
