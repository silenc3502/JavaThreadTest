public class User2 extends Thread {
    private Calculator calc;

    public void setCalc(Calculator calc) {
        this.setName("User2");
        this.calc = calc;
    }

    public void run () {
        calc.setMemory(50);
    }
}
