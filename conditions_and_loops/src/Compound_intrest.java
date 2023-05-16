import java.util.Scanner;

public class Compound_intrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        System.out.println("Enter the initial amount");
        float pv= input.nextInt();

        System.out.println("Enter the duration in years");
        float t= input.nextInt();

        System.out.println("Enter the amount of intrest");
        float r= input.nextInt();

        System.out.println("Enter the nummber of times that intrest is compounded");
        float n= input.nextInt();

        double amount= pv * Math.pow(1 + (r/n) , n*t);

        double cintrest=amount - pv;

        System.out.println();

        System.out.println("Compound Interest after " + t + " years: "+cintrest);
        System.out.println("Amount after " + t + " years: "+amount);


    }
}
