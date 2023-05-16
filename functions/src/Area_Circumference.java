import java.util.Scanner;

public class Area_Circumference {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

       // circumferece();

        System.out.println("Enter the radius of circle to calculate area");
        double r= in.nextDouble();
        System.out.println(areaa(r));
    }



    static void circumferece() {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the radius of circle to calculate the circumference");
         float r=in.nextFloat();
         double c=2 * 3.14 * r;
         System.out.println("The circumference of circle = "+c);

    }

     static double areaa(double r) {


         double area=3.14 * Math.pow(r,2);

         return  area;

    }

}
