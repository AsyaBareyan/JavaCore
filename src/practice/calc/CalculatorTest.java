package practice.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.plus(4, 7));
        System.out.println(calculator.minus(4, 7));
        System.out.println(calculator.divide(10, 5));
        System.out.println(calculator.multiple(2, 4));
    }
}
