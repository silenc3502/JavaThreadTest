public class MultiThreadSyncExam {
    public static void main(String[] args) {
        CalculatorSync calc = new CalculatorSync();

        User1Sync user1 = new User1Sync();
        user1.setCalc(calc);
        user1.start();

        User2Sync user2 = new User2Sync();
        user2.setCalc(calc);
        user2.start();
    }
}
