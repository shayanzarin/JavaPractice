package lambda;

public interface TestInterface {
     void testMethode (int x);

     default void methode(){
         System.out.println("hello!");
     }
}
