public class WorkGroupThread extends Thread {
    public WorkGroupThread (ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName);
    }

    public void run () {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + "interrupted");
                break;
            }
        }

        System.out.println(getName() + " Finished!");
    }
}
