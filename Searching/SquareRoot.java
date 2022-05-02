package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(26));
    }
    public static int squareRoot(int n){
        int low=0;
        int high=n;
        int res=0;

        while(low<=high){
            int mid=low+(high-low)/2;
        
            if(mid*mid==n)return  mid;
            if(mid*mid<n){
                low=mid+1;
                res=mid;
            }else{
                high=mid-1;
            }
        }

        return res;
    }
}
