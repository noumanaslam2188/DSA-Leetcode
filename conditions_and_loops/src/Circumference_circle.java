import java.util.Scanner;

public class Circumference_circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Circumference/peremiter of circle

        System.out.println("Enter the radius");
        float r= input.nextFloat();

        double perimeter= 2 * 3.14 * r;
        System.out.println(perimeter);
    }
}
