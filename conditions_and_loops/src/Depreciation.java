import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the price of asset");
        int price=input.nextInt();

        System.out.println("Enter the holding period in months");
        int months= input.nextInt();

        int dep_rate=10;

        double depreciation= price * months/12 * dep_rate / 100;

        System.out.println("Depreciation = "+ depreciation);
    }
}
