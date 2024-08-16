class Calculator2 {
    public void add(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }

    public void sub(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    public void multi(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    public void divi(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }
    }

    public void show(int num1, int num2) {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}

public class Calculator2Test {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int num1 = 20;
        int num2 = 3;
        calc.show(num1, num2);
        calc.add(num1, num2);
        calc.sub(num1, num2);
        calc.multi(num1, num2);
        calc.divi(num1, num2);
    }
}
