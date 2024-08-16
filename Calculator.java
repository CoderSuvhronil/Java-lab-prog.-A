class Calculator {
    int num1;
    int num2;

    public void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    public void sub() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    public void multi() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    public void divi() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }
    }

    public void show() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.num1 = 20;
        calc.num2 = 3;
        calc.show();
        calc.add();
        calc.sub();
        calc.multi();
        calc.divi();
    }
}
