import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        plindrome();
    }

    static void plindrome() {

        int num=45;
        int original=num;
        int rev=0;

        for(int i=0; i<num;){
            int l=num%10;
            rev=rev * 10 +l;
            num=num/10;


        }
        if(rev==original){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
