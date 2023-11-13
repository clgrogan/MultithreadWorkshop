package demo.termination.userinput;

public class WaitingForUserApp {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new WaitingForUserInput());
        thread.setName("InputWaitingThread");
        thread.start();

        Thread.sleep(4000);
        thread.interrupt();

    }
}
