import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter side of equilateral triangle");
        double a= input.nextFloat();

        a=Math.pow(a,2);

        double area=Math.sqrt(3) / 4 * a;
        System.out.println(area);
    }
}
