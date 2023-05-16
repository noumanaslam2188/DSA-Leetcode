import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Area of isoscelous triangle

        System.out.println("Enter the base of triangle");
        float base= input.nextFloat();

        System.out.println("Enter the height");
        float h= input.nextFloat();

        float area = base * h / 2f;
        System.out.println(area);
    }
}
