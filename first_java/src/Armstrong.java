public class Armstrong {
    public static void main(String[] args) {

        int n1=153;
        double temp;
        int armstrong=0;
        int origional=n1;
        while (n1>0){
            temp=n1%10;
            temp=Math.pow(temp,3);
            armstrong+=temp;
            n1=n1/10;
        }
        if(armstrong==origional){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("its no armstrong number");
        }
    }
}
