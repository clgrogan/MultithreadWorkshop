package demo.termination;

import java.math.BigInteger;

public class DaemonApp {
    public static void main(String[] args) throws InterruptedException {


        Thread longComputationThread = new Thread(new LongComputationTask(new BigInteger("331"), new BigInteger("100000")));

        longComputationThread.setDaemon(true);

        longComputationThread.start();

        Thread.sleep(1500);

    }
}
