import java.util.Map;
import java.util.Set;

public class ThreadInfoExam {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();

        for (Thread thread : threads) {
            System.out.println("Name: " + thread.getName() + ((thread.isDaemon()) ? "(Daemon)" : "(Main)"));
            System.out.println("\tGroup: " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
