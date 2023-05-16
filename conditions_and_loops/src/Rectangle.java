import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //area of Rectangle

        System.out.println("Enter the length");
        float length= input.nextFloat();

        System.out.println("Enter the width");
        float width= input.nextFloat();

        float area=length * width;

        System.out.println(area);
    }
}
