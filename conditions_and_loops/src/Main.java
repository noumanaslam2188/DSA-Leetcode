import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//         int salary=20001;
//        if(salary>10000){
//            salary+=2000;
//        }else {
//            salary+=1000;
//        }
//        if(salary>10000){
//            salary+=2000;
//        } else if (salary>20000) {
//            salary+=3000;
//        }else {
//            salary+=1000;
//        }
//        System.out.println(salary);

        //loops//

//      Q: print numbers 0 to 5
//        for(int num=0; num<=5; num+=1){
//            System.out.println(num);
//        }

        //Q print numbers from 1 to n

//        System.out.println("Enter the number");
//        int n= input.nextInt();
//        for (int num = 1; num <= n; num++) {
//
//            System.out.println("Hello World " );
//        }

        //while loops

//        int num=1;
//        while (num<=10){
//            System.out.println(num);
//            num++;
//        }

        //do while loops

//        int n=1;
//        do{
//            System.out.println(n);
//            n++;
//        }while (n<=5);
//

        //Q: find the largest in 3 numbers

//        System.out.println("enter 1st num");
//        int a= input.nextInt();
//        System.out.println("enter 2nd");
//        int b= input.nextInt();
//        System.out.println("enter 3rd");
//        int c= input.nextInt();
//        int max=a;
//        if(b>max){
//            max = b;
//        } if (c>max) {
//            max = c;
//
//        }
        //check letter is lowercase or uppercase
//        char ch=input.next().charAt(0);
//        System.out.println();
//
//        if(ch >='a' && ch<='z'){
//            System.out.println("its lowercase");
//        }else {
//            System.out.println("its uppercase");
//        }

        //fibonacci series

//        int f=1;
//        int l=1;
//        int t;
//        int n=7;
//
//        for(int i=1;i<=n;i++){
//            t=f+l;
//
//            f=l;
//            l=t;
//            System.out.println(t);

        //search and count the number

//        int temp;
//
//        int count=0;
//
//        System.out.println("enter number");
//        int n= input.nextInt();
//        System.out.println("enter no you want to count");
//        int search= input.nextInt();
//
//        while (n>0){
//            temp=n%10;
//            if(temp==search){
//
//                count++;
//            }
//            n=n/10;
//
//        }
//        System.out.print(count);

        //Reverse the number

//        int num=123456;
//        int ans=0;
//
//        while (num>0){
//            int rem=num%10;
//            num=num/10;
//
//            ans=ans * 10 + rem;
//        }
//
//        System.out.println(ans);


        //Building Calculator

        int ans=0;

        while (true){

            System.out.println("Enter the operator");

            char op=input.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){

                System.out.println("Enter two numbers");
                int num1= input.nextInt();
                int num2= input.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }

                if(op=='-'){
                    ans=num1-num2;
                }

                if(op=='*'){
                    ans=num1*num2;
                }

                if(op=='/'){
                    if(num2 !=0){
                       ans= num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                } else if (op=='x' || op=='X') {
                    break;

                }else {
                    System.out.println("invalid operation");
                }
                System.out.println(ans);
            }
        }
    }
}