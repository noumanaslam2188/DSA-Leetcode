import java.util.Scanner;

public class Kunal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int days=31;
        int hangout_days=0;
        int count=0;

        for(int i=1; i<=days; i++){

            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
