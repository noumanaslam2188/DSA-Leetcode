import java.util.Scanner;

public class Max_Min_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // Maximum();


        System.out.println(minimum());
    }

    //without return type
    static void Maximum(){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1=input.nextInt();
        System.out.println("Enter 2nd number");
        int num2= input.nextInt();
        System.out.println("Enter the 3rd number");
        int num3=input.nextInt();

        int max=num1;

        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        System.out.println("Maximum Number = "+max);

    }

    //with return type
    static int minimum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1=input.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=input.nextInt();
        System.out.println("Enter the 3rd number");
        int num3=input.nextInt();

        int min=num1;

        if (min>num2){
            min=num2;
        }
        if (min>num3){
            min=num3;
        }
        return min;
    }
}
