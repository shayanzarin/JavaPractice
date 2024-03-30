package exception;

public class Test2 {
    public static void throwTest() throws IllegalAccessException{
        System.out.println("throw test!");
        throw new IllegalAccessException("illegal");
    }

    public static void main(String[] args) {
        try {
            throwTest();
        }catch (IllegalAccessException e){
            System.out.println("test2");
        }
    }


}
