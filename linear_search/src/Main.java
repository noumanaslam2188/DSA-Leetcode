import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] nums={12,45,56,78,-5,65};
//        int target=8;
//
//        boolean ans=linear(nums,target);
//        System.out.println(ans);



        // for string

//        String name="nouman";
//        char target='s';
//       //System.out.println(searchstring(name,target));
//        System.out.println(Arrays.toString(name.toCharArray()));


        //search in range

//        int start=2;
//        int end= 5;
//        int target=70;
//
//        int[] arr={1,2,34,65,70,43,54,38};
//
//        int ans=linearinrange(arr,target,start,end);
//        System.out.println(ans);

        //find the minimum

//        int[] nums={1,2,3,4,5,54,57,-7};
//        int ans=min(nums);
//        System.out.println(ans);


        // 2D array

        int[][] nums={
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12,13}
        };
        int target=12;
        int[] ans=searchingin2D(nums,target);
        System.out.println(Arrays.toString(ans));




    }
//    static int linear(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            int element=arr[index];
//            if (element==target){
//                return index;
//            }
//        }
//        return -1;
//    }


//    static boolean linear(int[] arr,int target){
//        if(arr.length==0){
//            return false;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            int element=arr[index];
//            if (element==target){
//                return true;
//            }
//        }
//        return false;
//    }





    //for string

//    static boolean searchstring(String name,char target){
//        if(name.length()==0){
//            return false;
//        }
//
//        for (int i = 0; i < name.length(); i++) {
//
//            if(target == name.charAt(i)){
//                return true;
//            }
//
//        }
//        return false;
//    }


//
//    static int linearinrange(int[] arr,int target,int start,int end){
//        if(arr.length==0){
//            return -1;
//        }
//
//        for (int index = start; index <= end; index++) {
//            int element=arr[index];
//            if (element==target){
//                return index;
//            }
//        }
//        return -1;
//    }

    // find the minum

//    static int min(int[] arr){
//        int ans=arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(ans>arr[i]){
//                ans=arr[i];
//            }
//
//        }
//        return ans;
//    }




    // for 2D array

    static int[] searchingin2D(int[][] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{-1,-1};
       // return 0;
    }
}