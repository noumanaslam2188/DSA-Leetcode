import java.util.Scanner;

public class Perimeter_rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the length");
        float l= input.nextFloat();

        System.out.println("Enter the width");
        float w=input.nextFloat();

        float perimeter=2 * (l+w);
        System.out.println(perimeter);
    }
}
