import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultThreadExam {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("Thread Operation Request");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }

                System.out.println("Operation Result: " + sum);
            }
        };

        Future future = executorService.submit(runnable);

        try {
            future.get();
            System.out.println("Operation Finished!");
        } catch (Exception e) {
            System.out.println("Execution Exception Occurrence: " + e.getMessage());
        }

        executorService.shutdown();
    }
}
