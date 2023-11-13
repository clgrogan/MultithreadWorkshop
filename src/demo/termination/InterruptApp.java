package demo.termination;

import java.math.BigInteger;

public class InterruptApp {
    public static void main(String[] args) throws InterruptedException {

        Thread blockThread = new Thread(new BlockingTask());

        blockThread.start();
        blockThread.interrupt();

        Thread longComputationThread = new Thread(new LongComputationTask(new BigInteger("331"), new BigInteger("100000")));

        longComputationThread.start();

        Thread.sleep(1555);
        longComputationThread.interrupt();

    }
}
