// class SMSThread extends Thread{
//     @Override
//     public void run()
//     {
//         super.run();
//         for (int i = 0; i < 20; i++) {
//             System.out.println("Sending SMS "+i);
//         }
//     }
// }
// class EmailThread extends Thread{
//     @Override
//     public void run()
//     {
//         super.run();
//         for (int i = 0; i < 20; i++) {
//             System.out.println("Set up SMIP Server "+i);
//             System.out.println("Sent an Email "+i);
//         }
//     }
// }
class EmailSender implements Runnable{
    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" Email Sent "+i);
        }
    }
}
class SMSSender implements Runnable{
    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" SMS Sent "+i);
        }
    }
}
public class TestThread{
    public static void main(String[] args) {
        // SMSThread s = new SMSThread();
        // EmailThread e = new EmailThread();
        EmailSender es = new EmailSender();
        Thread t = new Thread(es,"Results");
        // s.start();
        // e.start();
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
        //System.out.println("Exiting main");
    }
}
