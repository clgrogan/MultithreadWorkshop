package exercises.multiexecuter;

public class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\t" + Thread.currentThread().getId() + " " + i);
        }
    }
}
