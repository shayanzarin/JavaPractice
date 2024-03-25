package lambda;

public class LambdaTest {
    interface  Func1{
        int operate(int a, int b);
    }

    interface Func2{
        void message(String text);
    }

    public int myFunction(int a, int b, Func1 func1){
        return func1.operate(a, b);
    }

    public static void main(String[] args) {
        Func1 add = (int x, int y ) -> x + y;

        Func1 multi = (int x, int y) -> x * y;

        LambdaTest lambdaTest=new LambdaTest();
        System.out.println("add: " + lambdaTest.myFunction(2 ,4,add));
        System.out.println("multi: " + lambdaTest.myFunction(2, 4, multi));

        Func2 func2 = text -> System.out.println("hello " + text);
        func2.message("Java!");



    }
}
