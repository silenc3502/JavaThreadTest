public class User2Sync extends Thread {
    private CalculatorSync calc;

    public void setCalc(CalculatorSync calc) {
        this.setName("User2");
        this.calc = calc;
    }

    public void run () {
        calc.setMemory(50);
    }
}
