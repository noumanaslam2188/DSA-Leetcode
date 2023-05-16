import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int pad;

        System.out.println("Enter the price marked price on product");
        int mp= input.nextInt();

        int payamount=100-25;

        pad=(payamount * mp) / 100;

        System.out.println("Price after discount = "+pad);
    }
}
