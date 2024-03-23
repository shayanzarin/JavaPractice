package thread;

public class ThreadTestSecond implements Runnable{
    public static void main(String[] args) {
        ThreadTestSecond obj=new ThreadTestSecond();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("not thread");
    }
    @Override
    public void run() {
        System.out.println("test in thread");
    }
}
