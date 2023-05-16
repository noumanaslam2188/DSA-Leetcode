import java.util.Scanner;

public class Product_sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int result1=1;
        int result2=0;
        int temp=0;
        int result3=0;

        System.out.println("Enter the number");
        int n= input.nextInt();

        while (n>0){

              temp=n%10;
              result1*=temp;
              result2+=temp;
            n=n/10;

        }
//        System.out.println("Produt = "+result1);
//        System.out.println("Addition = "+result2);
        result3 =result1-result2;
        System.out.println("Final calculation = "+result3);

    }
}
