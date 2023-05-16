import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int l=0;

        while (true){

            System.out.println("Enter numbers");
            int num= input.nextInt();

            if(l<num){
                l=num;
            }
            if(num==0){
                break;
            }



        }
        System.out.println("largest = "+l);
    }
}
