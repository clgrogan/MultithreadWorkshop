package demo.termination.userinput;

import java.io.IOException;
import java.math.BigInteger;

public class WaitingForUserInput implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.err.println("\nInterrupted ");
                    return;
                }
                System.out.println("Enter \"q\" to quit...\n");
                char input = (char) System.in.read();
                if(input == 'q') {
                    return;
                }
            }
        } catch (IOException e) {
            System.out.println("An exception was caught " + e);
        };
    }
}
