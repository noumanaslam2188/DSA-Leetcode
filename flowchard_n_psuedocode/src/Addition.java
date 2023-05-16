import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);




        System.out.println("Enter numbers to find their sum ");

        System.out.println("Enter first number ");
        int num1= input.nextInt();

        System.out.println("Enter second nummber ");
        int num2= input.nextInt();

        int sum=num1+num2;

        System.out.println("Sum of numbers = " + sum);

    }
}
