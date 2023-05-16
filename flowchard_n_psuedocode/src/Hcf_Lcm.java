import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//
//        System.out.println("Enter number 1");
//        int num1= input.nextInt();
//        System.out.println("Enter number 2");
//        int num2= input.nextInt();
//
//        for (int i=1; i<num1 && i<num2; i++)
//        {
//
//            if (i%num1==0 && i%num2==0){
//                System.out.println(i);
//            }
//        }
        System.out.println("Enter first number");
        int num1= input.nextInt();

        System.out.println("Enter second number ");
        int num2=input.nextInt();
        int gcd;

        for(int i=1; i<=num2 ; i++){
            if (num1%i==0 && num2%i==0) {
                gcd=i;
                System.out.println( + i);

            }

        }
    }
}
