public class ThreadsTest extends Thread{
    public static void main(String[] args) {
        ThreadsTest thread=new ThreadsTest();
        thread.start();

        System.out.println("out of thread!");

    }
    public void run(){
        System.out.println("test in thread!");
    }
}
