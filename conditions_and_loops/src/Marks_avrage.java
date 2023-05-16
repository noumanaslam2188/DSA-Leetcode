import java.util.Scanner;

public class Marks_avrage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int count=1;
        double sum=0;
        double avrage=0;

        System.out.println("Enter the number of subjects");
        int subjects=input.nextInt();

        while (count<=subjects){
            System.out.println("Enter the marks of subject "+count);
            double marks=input.nextDouble();

             sum=sum+marks;

             avrage=sum/count;
             count++;
        }
        System.out.println("Avrage of marks = "+avrage);


    }
}
