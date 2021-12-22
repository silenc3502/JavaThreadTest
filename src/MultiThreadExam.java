public class MultiThreadExam {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        User1 user1 = new User1();
        user1.setCalc(calc);
        user1.start();

        User2 user2 = new User2();
        user2.setCalc(calc);
        user2.start();
    }
}
