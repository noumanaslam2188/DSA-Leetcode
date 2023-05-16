import java.util.Scanner;

public class Prime_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= in.nextInt();
        prime(num);
        //System.out.println(num);
    }

     static void prime(int num) {
         boolean prime=true;
        for(int i=2; i<num; i++ ){

            if(num%i==0){
                prime=false;
                System.out.println("Number is not prime");
                break;

            }

        }
         System.out.println(prime);
    }


}
