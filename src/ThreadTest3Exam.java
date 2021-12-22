import java.awt.*;

public class ThreadTest3Exam {
    public static void main (String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("빞");

            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}