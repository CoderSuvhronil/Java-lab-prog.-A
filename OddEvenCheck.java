import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is an EVEN number");
        } else {
            System.out.println(num + " is an ODD number");
        }
    }
}