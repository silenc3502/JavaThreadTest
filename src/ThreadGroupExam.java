public class ThreadGroupExam {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkGroupThread workGrouptThreadA = new WorkGroupThread(myGroup, "workGroupThreadA");
        WorkGroupThread workGrouptThreadB = new WorkGroupThread(myGroup, "workGroupThreadB");

        workGrouptThreadA.start();
        workGrouptThreadB.start();

        System.out.println("[main Thread Group list()]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();

        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { }

        System.out.println("[myGroup Thread Group interrupt()");
        myGroup.interrupt();
    }
}
