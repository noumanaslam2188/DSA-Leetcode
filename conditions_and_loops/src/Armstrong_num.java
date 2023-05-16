public class Armstrong_num {
    public static void main(String[] args) {

        int num=153;
        int ans=0;
        double temp=0;



        while(num >0){

            temp=num%10;

            temp=Math.pow(temp,3);
            ans+=temp;
            num=num/10;


        }
        System.out.println(ans);
    }
}
