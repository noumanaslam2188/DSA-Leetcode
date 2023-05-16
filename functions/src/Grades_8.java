import java.util.Scanner;

public class Grades_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter marks");
        int numbers= in.nextInt();
        grade(numbers);



    }

     static int grade(int marks) {

         if(marks>=91 && marks<=100){
             System.out.println("AA");
         }

         if(marks>=81 && marks<=90){
             System.out.println("AB");
         }

         if(marks>=71 && marks<=80){
             System.out.println("BB");
         }

         if(marks>=61 && marks<=70){
             System.out.println("BC");
         }

         if(marks>=51 && marks<=60){
             System.out.println("CD");
         }

         if(marks>=41 && marks<=50){
             System.out.println("DD");
         }

         if(marks>=0 &&marks<=40){
             System.out.println("FAIL!");
         }else {
             System.out.println("Invalid input");
         }
         return marks;
    }
}
