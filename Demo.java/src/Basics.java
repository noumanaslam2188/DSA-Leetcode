import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        if(false){
//            System.out.println("Hello world");
//        }
//        int count=1;
//        while (count !=5) {
//            count++;
//            System.out.println(count);
//        for(int count=1; count !=5; count++){
//            System.out.println(count);
//        }
        System.out.println("Enter temperacture in Celcious");
        float tempC= input.nextFloat();

        float tempF=(tempC * 9/5) + 32;

        System.out.println("Temperature in Forenheight "+ tempF);

        }
    }

