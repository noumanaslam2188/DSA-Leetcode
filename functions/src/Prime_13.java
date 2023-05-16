import java.util.Scanner;

public class Prime_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Prime numbers between " + num1 + " and " + num2 + ":");

        for (int i = num1; i <= num2; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
