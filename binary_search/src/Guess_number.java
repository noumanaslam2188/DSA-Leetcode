public class Guess_number {
    public static void main(String[] args) {
        int n=5;
        int ans=arrangeCoins(n);
        System.out.println(ans);
    }
    static int arrangeCoins(int n) {
        long start=1;
        long end=n;

        while(start<=end){
            long mid=start+(end-start)/2;

            if(mid*(mid+1)/2==n){
                return (int)mid;
            }
            else if(mid*(mid+1)/2 <n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)end;
    }
}
