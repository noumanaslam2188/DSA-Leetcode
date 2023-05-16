import java.util.Scanner;

public class Input_name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name="";

        System.out.println("Enter your name");
        name= input.next();

        System.out.println("Welcome "+name );
    }
}
