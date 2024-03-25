package lambda;

import java.awt.*;
import java.util.ArrayList;

public class Test  {
    public static void main(String[] args) {
        TestInterface obj= (int x) -> System.out.println(2*x);
        obj.testMethode(9);


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.forEach(System.out::println);
        System.out.println();

        arrayList.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

    }
}
