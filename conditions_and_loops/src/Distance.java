import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the value of x1");
        int x1= input.nextInt();

        System.out.println("Enter the value of x2");
        int x2= input.nextInt();

        System.out.println("Enter the value of y1");
        int y1= input.nextInt();

        System.out.println("Enter the value of y2");
        int y2= input.nextInt();

        double distance;

        distance=Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println("Distance = "+distance);
    }
}
