class EmailSender implements Runnable{
    @Override
    public void run()
    {
        for (int i = 20; i > 0; i--) {
            System.out.println(Thread.currentThread().getName()+" Email Sent "+i);
        }
    }
}
class SMSSender implements Runnable{
    @Override
    public void run()
    {
        for (int i = 20; i > 0; i--) {
            System.out.println(Thread.currentThread().getName()+" SMS Sent "+i);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        EmailSender es = new EmailSender();
        Thread t = new Thread(es,"Results");
        t.start();
        Thread t2 = new Thread(es,"Events");
        t2.start();
        Thread t3 = new Thread(es);
        t3.start();
        Thread t4 = new Thread(es);
        t4.start();
        SMSSender ss = new SMSSender();
        Thread t5 = new Thread(ss);
        t5.start();
        Thread t6 = new Thread(ss);
        t6.start();
    }
}