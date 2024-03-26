package lambda;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(32);
        arrayList.add(12);
        arrayList.add(76);
        arrayList.add(11);
        arrayList.add(44);

        System.out.println("before sorting: " + arrayList);

        Collections.sort(arrayList, (o1, o2) -> o2.compareTo(o1));

        System.out.println("after: " + arrayList);
    }
}
