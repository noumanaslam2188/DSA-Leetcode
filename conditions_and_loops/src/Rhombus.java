import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Area of Rhombus

        System.out.println("Enter the Diagonal 1  ");
        float d1 = input.nextFloat();

        System.out.println("Enter the Diagonal 2");
        float d2 = input.nextFloat();

        float area = d1 * d2 / 2;
        System.out.println(area);
    }
}