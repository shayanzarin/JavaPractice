package thread;

public class ThreadSend extends  Thread{
    public String msg;
    Sender sender;

     public ThreadSend(String message, Sender sender) {
         this.msg = message;
         this.sender = sender;
     }

     @Override
     public void run() {
         synchronized (sender){
             sender.sendMessage(msg);
         }
     }
 }
