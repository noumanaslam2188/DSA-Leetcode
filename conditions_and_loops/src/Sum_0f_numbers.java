import java.util.Scanner;

public class Sum_0f_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int r1=0;
        int r2=0;
        int r3=0;

        while (true){

            System.out.println("Enter the numbers");
            int num= input.nextInt();

            if(num <0){

                r1=r1+num;
            }

            if(num%2 ==0 && num>0){

                r2=r2+num;
            }

            if(num%2 !=0){

                r3=r3+num;
            }
            if(num==0){
                break;
            }
        }
        System.out.println("sum of negative numbers = "+r1);
        System.out.println("sum of even numbers = "+r2);
        System.out.println("sum of odd numbers = "+r3);
    }
}
