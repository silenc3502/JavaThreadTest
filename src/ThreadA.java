public class ThreadA extends Thread {
    public ThreadA () {
        setName("스레드 A");
    }

    public void run () {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName() + "동작!");
        }
    }
}
