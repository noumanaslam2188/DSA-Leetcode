import java.util.Scanner;

public class Currency_changer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter amount in rupees");
        int amount= input.nextInt();

        float usd=amount/270f;
        System.out.println("Converted into dollors "+usd);
    }
}
