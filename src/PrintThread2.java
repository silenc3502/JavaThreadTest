public class PrintThread2 extends Thread {
    public void run () {
        while (true) {
            System.out.println("Execution");

            if (Thread.interrupted()) {
                break;
            }
        }

        System.out.println("Finish");
    }
}
