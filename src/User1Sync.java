public class User1Sync extends Thread {
    private CalculatorSync calc;

    public void setCalc(CalculatorSync calc) {
        this.setName("User1");
        this.calc = calc;
    }

    public void run () {
        calc.setMemory(100);
    }
}
