import java.util.Scanner;

public class Comission {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the selling price");
        int sp= input.nextInt();
        int cp=10;

        float comission=(sp*cp) / 100;

        System.out.println("Comission = "+comission);
    }
}
