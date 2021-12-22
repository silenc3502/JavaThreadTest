import java.awt.*;

// sudo apt install openjdk-11-jdk
public class ThreadTest1Exam {
    public static void main (String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}