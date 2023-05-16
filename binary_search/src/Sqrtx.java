public class Sqrtx {
    public static void main(String[] args) {
        int x = 8;
        long s = 1;
        long e = x;
        long ans = -1;
        long mid = s + (e - s) / 2;
        long sqrt = mid * mid;
        while (s <= e) {

            if (mid == x) {
                ans=mid;
                System.out.println(ans);
                break;
            }
            else if (sqrt < x) {
                s = mid + 1;
                ans = mid;

            }
            else {
                e = mid - 1;
            }


        }
        System.out.println(ans);
    }
//    static int squreroot(int x){
//        int start=1;
//        int end=x;
//        int ans=-1;
//
//        while (start <= end){
//
//             long long mid=(start + (end- start))/ 2;
//             long long sqrt=mid*mid;
//
//            if(sqrt < x){
//                ans=mid;
//                start=mid+1;
//            }
//            else {
//                end=mid-1;
//            }
//
//        }
//        return ans;
//    }
}
