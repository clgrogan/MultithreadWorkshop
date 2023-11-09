package thread.creation;

import mt.tools.Tools;

import static mt.tools.Tools.printThreadDetails;

public class ThreadCreationMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                printThreadDetails("run() executed for:",Thread.currentThread());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                throw new RuntimeException("Intentional Exception");
            }
        });
        Thread threadLambda = new Thread(() -> {
            printThreadDetails("run() executed for:",Thread.currentThread());
        });
        Thread badThread = new Thread(() -> {
            printThreadDetails("run() executed for:",Thread.currentThread());
        });


        printThreadDetails("Current thread: ", Thread.currentThread());
        printThreadDetails("New thread \"thread\": ", thread);
        printThreadDetails("New thread \"threadLambda\": ", threadLambda);

        thread.setName("\"thread\"");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread " + t.getName() + " the error is " + e.getMessage());
                System.err.println("\n\tA critical error happened in thread " + t.getName() + " the error is " + e.getMessage());
            }
        });

        thread.start();
//        Thread.sleep(2000);
        threadLambda.start();

        printThreadDetails("\"thread\": ", thread);
        printThreadDetails("\"threadLambda\": ", threadLambda);

        badThread.setName("BAD THREAD (throws)");

    }
}
