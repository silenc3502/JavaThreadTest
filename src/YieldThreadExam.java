public class YieldThreadExam {
    public static void main(String[] args) {
        YieldThreadA threadA = new YieldThreadA();
        YieldThreadB threadB = new YieldThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { }

        threadA.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { }

        threadA.work = true;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { }

        threadA.stop = true;
        threadB.stop = true;
    }
}
