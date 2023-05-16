import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Vote_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= input.nextInt();
        vote(age);

    }
    static int vote(int age){
        if(age>=18){
            System.out.println("You can vote ");
        }else {
            System.out.println("You can not vote");
        }
        return age;
    }
}
