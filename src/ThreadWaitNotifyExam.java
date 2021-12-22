public class ThreadWaitNotifyExam {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        WorkThreadA threadA = new WorkThreadA(sharedObject);
        WorkThreadB threadB = new WorkThreadB(sharedObject);

        threadA.start();
        threadB.start();
    }
}
