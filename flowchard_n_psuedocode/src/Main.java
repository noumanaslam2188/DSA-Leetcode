import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input a year and check whether it is leap or not

        for (int i=5; i>4;i++){

            System.out.println("Enter the year to check leap year or not");

            int year= input.nextInt();

            if(year%4==0){
                System.out.println("this is leap year");
            }
            else {
                System.out.println("This is not leap year");
            }

        }


    }
}