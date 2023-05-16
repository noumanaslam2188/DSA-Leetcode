import java.util.Scanner;

public class CGPA_calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int count=1;
        float gpa_sum=0;
        int credit_sum=0;
        double cpga=0;
        float wv=0;
        System.out.println("Enter the number of semesters of which you want to calculate gpa");
        int semesters= input.nextInt();

        while (count<=semesters){

            System.out.println("Enter the GPA of semester "+count);
            float gpa= input.nextFloat();

            System.out.println("Enter the credit hours of semester "+count);
            int credits= input.nextInt();

            wv=gpa * credits;

            gpa_sum=gpa_sum+wv;
            credit_sum=credit_sum+credits;

            cpga=gpa_sum / credit_sum;
            count++;
        }
        System.out.println("CGPA = "+cpga);
    }
}
