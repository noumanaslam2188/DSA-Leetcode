public class Even_Digits {
    public static void main(String[] args) {

        int[] nums={12,345,2,6,7896};
        int sum=0;


        for (int i = 0; i < nums.length; i++) {

            int digits=(int) Math.log10(nums[i]) +1;
            if (digits % 2==0){
                sum++;
            }

        }
        System.out.println(sum);

    }
}
