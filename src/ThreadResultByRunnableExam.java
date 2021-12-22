import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Result {
    int accumValue;

    synchronized void addValue (int value) {
        accumValue += value;
    }
}

public class ThreadResultByRunnableExam {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("Operation Request");

        class Task implements Runnable {
            Result result;

            Task (Result result) {
                this.result = result;
            }

            public void run () {
                int sum = 0;

                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }

                result.addValue(sum);
            }
        }

        Result result = new Result();
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);

        Future<Result> future1 = executorService.submit(task1, result);
        Future<Result> future2 = executorService.submit(task2, result);

        try {
            result = future1.get();
            System.out.println("Operation Result1: " + result.accumValue);

            result = future2.get();
            System.out.println("Operation Result2: " + result.accumValue);
            System.out.println("Operation Finish");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Execution Exception: " + e.getMessage());
        }

        executorService.shutdown();
    }
}
