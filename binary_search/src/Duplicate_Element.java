public class Duplicate_Element {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        int result=singleNonDuplicate(nums);
        System.out.println(result);
    }
    static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            boolean halvesAreEven = (right - mid) % 2 == 0;
            if (nums[mid] == nums[mid + 1]) {
                if (halvesAreEven) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                if (halvesAreEven) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else {
                return nums[mid];
            }
        }

        return nums[left];
    }

}
