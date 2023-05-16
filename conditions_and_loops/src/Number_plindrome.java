public class Number_plindrome {
    public static void main(String[] args) {

        int num=121;
        int cutter;
        int reverse=0;
        int origional=num;

        while (num>0){

            cutter=num%10;

            reverse=reverse * 10 + cutter;

            num=num/10;

        }
        if(reverse==origional){
            System.out.println("It is plindrome number");
        }else {
            System.out.println("Its not plindrome");
        }

    }
}
