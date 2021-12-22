public class ThreadNameExam {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("스레드명: " + mainThread.getName());

        Thread threadA = new ThreadA();
        System.out.println("작업 스레드명: " + threadA.getName());
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("작업 스레드명: " + threadB.getName());
        threadB.start();
    }
}
