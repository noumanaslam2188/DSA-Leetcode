import java.util.Scanner;

public class Avrage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the count of numbers you want to calculate the avrage");
        int numbers= input.nextInt();
        float avrage=0f;
        int sum=0;
        int count=0;
        int num;
        while (count<numbers){

            System.out.println("Enter the number");
            num= input.nextInt();

            sum=sum+num;


            count++;
            avrage=sum/count;

        }

        System.out.println("Avrage = "+avrage);

    }
}
