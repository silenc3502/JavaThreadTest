public class PrintThread1 extends Thread {
    private boolean stop;

    public void setStop (boolean stop) {
        this.stop = stop;
    }

    public void run () {
        while (!stop) {
            System.out.println("Execution!");
        }

        System.out.println("Finish!");
    }
}
