import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallbackExam {
    private ExecutorService executorService;

    public CallbackExam () {
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("completed(): " + result);
        }

        @Override
        public void failed(Throwable exception, Void attachment) {
            System.out.println("failed(): " + exception.toString());
        }
    };

    public void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;

                    callback.completed(result, null);
                } catch (NumberFormatException e) {
                    callback.failed(e, null);
                }
            }
        };

        executorService.submit(task);
    }

    public void finish () {
        executorService.shutdown();
    }
}

public class ThreadCallbackExam {
    public static void main(String[] args) {
        CallbackExam exam = new CallbackExam();
        exam.doWork("3", "3");
        exam.doWork("3", "삼");
        exam.finish();
    }
}
