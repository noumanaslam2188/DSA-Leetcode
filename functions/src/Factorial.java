import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factoreal(5));
    }

//     static void Factoreal() {
//         Scanner in=new Scanner(System.in);
//
//         int r=1;
//
//         System.out.println("Enter a number");
//         int n= in.nextInt();
//
//
//         while (n>=1){
//             r=r*n;
//             n--;
//
//
//         }
//         System.out.println(r);
//    }

    static int Factoreal(int n) {
        Scanner in=new Scanner(System.in);

        int r=1;

        System.out.println("Enter a number");
         n= in.nextInt();


        while (n>=1){
            r=r*n;
            n--;
        }
        return r;
    }
}
