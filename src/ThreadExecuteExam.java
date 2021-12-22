import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExecuteExam {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run () {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Total Thread cnt: " + poolSize + ", Thread Name: " + threadName);

                    int value = Integer.parseInt("강제오류발생!");
                }
            };

            //executorService.execute(runnable);
            executorService.submit(runnable);

            Thread.sleep(10);
        }

        executorService.shutdown();
    }
}
