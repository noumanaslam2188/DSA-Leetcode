public class Main {
    public static void main(String[] args) {
       // messsage();
       // print1(1);
        print(1);
    }

    static void messsage(){
        System.out.println("Hello world!");
        messsage1();
        messsage2();
        messsage3();
        messsage4();
    }

    static void messsage1(){
        System.out.println("Hello world!");

    }

    static void messsage2(){
        System.out.println("Hello world!");
    }

    static void messsage3(){
        System.out.println("Hello world!");
    }

    static void messsage4(){
        System.out.println("Hello world!");
    }



    // print numbers from 1 to 5


    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);

    }


    //function 3 print, optimized fuction not repeating the functions over again and again
    static void print(int n){
        if(n == 5){
             System.out.println(5);
            return;
        }
        System.out.println(n);

         print(n+1);

    }
}