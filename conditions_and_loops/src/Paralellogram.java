import java.util.Scanner;

public class Paralellogram {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            //Area of Paralellogram

            System.out.println("Enter the base  ");
            float base= input.nextFloat();

            System.out.println("Enter the height");
            float h= input.nextFloat();

            float area = base * h;
            System.out.println(area);
        }
    }


