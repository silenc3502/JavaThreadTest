import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadResultByCallableExam {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("Operation Request");

        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;

                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }

                return sum;
            }
        };

        Future<Integer> future = executorService.submit(task);

        try {
            int sum = future.get();
            System.out.println("Operation Result: " + sum);
            System.out.println("Operation Finish!");
        } catch (Exception e) {
            System.out.println("Execution Exception: " + e.getMessage());
        }

        executorService.shutdown();
    }
}
