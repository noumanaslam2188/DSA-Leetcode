import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Area of circle

        System.out.println("Enter the radius of circle");
        double radius= input.nextDouble();

        radius=Math.pow(radius, 2);

        double area=3.14 *radius;

        System.out.println(area);

    }
}
