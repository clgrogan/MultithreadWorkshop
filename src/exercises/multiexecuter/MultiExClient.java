package exercises.multiexecuter;

import java.util.ArrayList;
import java.util.List;

public class MultiExClient {
    public static void main(String[] args) {
        List<Runnable> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threads.add(new Task());
        }

        MultiExecutor executor = new MultiExecutor(threads);
        executor.executeAll();
    }
}
