import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //calculate the electricity bill
        float units=0f;
        float bill;
        System.out.println("Enter the watts of appliance");
        int watts=input.nextInt();
        float kwh=watts/1000f;

        System.out.println("Duration of appliance usage per day in hours");
        int time= input.nextInt();

        System.out.println("Provide the number of days you want to calculate the bill of");
        int days=input.nextInt();

        units=kwh * time * days;

        bill=units * 9f;
        System.out.println("Your bill = "+bill);



    }
}
