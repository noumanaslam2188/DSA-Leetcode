import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int result=0;


        System.out.println("Enter the number");
        int num=input.nextInt();

        int origional=num;

        for(int i=1; i<num; i++){

            if(num%i==0){

                result=result+i;

            }

        }
        if (result==origional){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Its not perfect number");
        }
    }
}
