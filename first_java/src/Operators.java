import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Press 1 for Addtion");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Dividion");
        int user= input.nextInt();

        if(user==1){
            System.out.println("Enter first number");
            int num1= input.nextInt();
            System.out.println("Enter second number");
            int num2= input.nextInt();
            int sum=num1+num2;
            System.out.println("Sum = "+sum);
        }

        if(user==2){
            System.out.println("Enter first number");
            int num1= input.nextInt();
            System.out.println("Enter second number");
            int num2= input.nextInt();
            int sub=num1-num2;
            System.out.println("Subtraction = "+sub);
        }

         if(user==3){
            System.out.println("Enter first number");
            int num1= input.nextInt();
            System.out.println("Enter second number");
            int num2= input.nextInt();
            int mul=num1*num2;
            System.out.println("Multiplication = "+mul);
        }
         if(user==4){
            System.out.println("Enter first number");
            int num1= input.nextInt();
            System.out.println("Enter second number");
            int num2= input.nextInt();
            float div=num1/num2;
            System.out.println("Division = "+div);
        }




    }
}
