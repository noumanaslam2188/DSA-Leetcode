public class Fibonachi_numbers {
    public static void main(String[] args) {
        //fibo(4);
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
