import java.util.Scanner;

public class Perimeter_equilateral {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the side");
        double a= input.nextDouble();

        double perimeter=3 * a;
        System.out.println(perimeter);
    }
}
