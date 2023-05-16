public class Find_Duplicate {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2,3};
        int ans=find_Dup(nums);
        System.out.println(ans);
    }
    static int find_Dup(int[] nums){
        int i=0;
        while (i < nums.length){

            if(nums[i] != i+1){
                int correct=nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;

    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
