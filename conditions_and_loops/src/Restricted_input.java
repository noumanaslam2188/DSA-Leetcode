import java.util.Scanner;

public class Restricted_input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sum=0;

        while (true){

            System.out.println("Enter the numbers");
            int n= input.nextInt();

            sum=sum+n;

            if(n==0){
                break;
            }

        }
        System.out.println("sum = "+sum);
    }
}
