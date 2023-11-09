package demo.bankhack;

public class Police extends Thread{

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + ", \"You have ten seconds. Countdown commencing...\"");
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\t"+i);

        }
        System.err.println("\n\tZERO!!!!");
        System.out.println("\nYou hackers failed and are under arrest.");
        System.exit(0);
    }
}
