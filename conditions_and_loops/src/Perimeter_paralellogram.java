import java.util.Scanner;

public class Perimeter_paralellogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the base");
        float b= input.nextFloat();

        System.out.println("Enter the height");
        float h= input.nextFloat();

        float perimeter= 2 * (b + h);
        System.out.println(perimeter);
    }
}
