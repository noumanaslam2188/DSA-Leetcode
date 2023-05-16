import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //print whether number is even or odd
        int num=0;

        for(int i=1; i>0; i++) {


            System.out.println("Enter number");
            num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }



    }
}