import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        even_odd(5);

    }
    static void even_odd(int num){
        Scanner input=new Scanner(System.in);
      //  System.out.println("Enter the number");
        int n= input.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
