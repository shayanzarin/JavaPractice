package lambda;

import java.awt.*;

public class Test  {
    public static void main(String[] args) {
        TestInterface obj= (int x) -> System.out.println(2*x);

        obj.testMethode(9);
    }
}
