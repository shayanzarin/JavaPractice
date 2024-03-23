package thread;

public class Sender {
    public void sendMessage(String text){
        System.out.println("sending "+text);
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("fail!!");
        }
        System.out.println(text + "sent!");
    }
}
