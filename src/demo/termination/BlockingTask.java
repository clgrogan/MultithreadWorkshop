package demo.termination;

public class BlockingTask implements Runnable{
    @Override
    public void run() {
        System.out.println("\nStarting " + this.getClass().getSimpleName() + " thread.");
        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            System.out.println("\nExiting " + this.getClass().getSimpleName() + " thread.");
        }
    }
}
