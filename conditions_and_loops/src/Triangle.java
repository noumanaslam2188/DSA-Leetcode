import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Area of Triangle

        System.out.println("Enter height ");
        float height= input.nextFloat();

        System.out.println("Enter base");
        float base= input.nextFloat();

        float area=height * base /2;

        System.out.println(area);
    }
}
