import java.awt.*;

public class ThreadTest2Exam {
    public static void main (String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("빞");

            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}