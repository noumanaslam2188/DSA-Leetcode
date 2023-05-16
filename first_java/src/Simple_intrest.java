import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);





        System.out.println("Enter the principal amount");
        int principal= input.nextInt();

        System.out.println("Enter the time ");
        int time=input.nextInt();

        System.out.println("Enter the intrest rate");
        int rate=input.nextInt();

        int intrest=principal * time * rate / 100;

        System.out.println("simple intrest = "+intrest);


    }
}
