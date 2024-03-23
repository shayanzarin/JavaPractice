public class Demo {
    public static void main(String[] args) {
        Sender sender=new Sender();
        ThreadSend threadSend1=new ThreadSend("test 1 : ", sender);
        ThreadSend threadSend2=new ThreadSend("test2 : ", sender);

        threadSend1.start();
        threadSend2.start();

        try {
            threadSend2.join();
            threadSend1.join();
        }catch (Exception e){
            System.out.println("fail!");
        }
    }
}
