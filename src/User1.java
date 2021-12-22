public class User1 extends Thread {
    private Calculator calc;

    public void setCalc(Calculator calc) {
        this.setName("User1");
        this.calc = calc;
    }

    public void run () {
        calc.setMemory(100);
    }
}
