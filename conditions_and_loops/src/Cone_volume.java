import java.util.Scanner;

public class Cone_volume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //volume of cone

        System.out.println("Enter the radius");
        double r= input.nextFloat();

        System.out.println("enter the height");
        double h= input.nextFloat();

        r=Math.pow(r,2);

        double vol=3.14 * r * h / 3;
        System.out.println(vol);
    }
}
