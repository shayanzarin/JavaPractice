package thread;

public class ConcurrencyProblem extends Thread{
    public static int amount=0;

    public static void main(String[] args) {
        ConcurrencyProblem thread=new ConcurrencyProblem();
        thread.start();
        while (thread.isAlive()){
            System.out.println("waiting....");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
    }
}
