import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        for (int i=5; i>4;i++) {
            System.out.println("Enter number to generate table ");
            int number = input.nextInt();

            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                System.out.println(number + " * " + multiplier + " = " + number * multiplier);

            }
        }


    }
}
