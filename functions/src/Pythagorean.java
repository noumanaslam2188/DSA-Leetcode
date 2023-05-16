import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {

        triplet();
    }

    static void triplet() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1= in.nextInt();
        System.out.println("Enter the 2nd number");
        double num2= in.nextInt();
        System.out.println("Enter the 3rd number");
        double num3= in.nextInt();

        double s1=Math.pow(num1,2);
        double s2=Math.pow(num2,2);
        double r1=s1+s2;

        double s3=Math.pow(num3,2);

        if(r1==s3){
            System.out.println("Pythagorean Triplet");
        }else {
            System.out.println("Not Triplet");
        }
    }
}
