import java.util.Scanner;

public class Product_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= input.nextInt();
        System.out.println("Enter the second number");
        int b= input.nextInt();

        //product(a,b);
        System.out.println(product(a,b));
    }

     static int product(int num1,int num2) {

        int result=num1 * num2;
        return result;
    }
}
