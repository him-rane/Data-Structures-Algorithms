package Hashing;

public class LongestCommonSpanWithSameSum {
    public static int longestCommonSpanWithSameSum(int[]arr1,int[]arr2){
        int[]temp=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        return LongestSubarrayWithGivenSum.longestSubarrayWithGivenSum(temp, 0);
    }
    public static void main(String[] args) {
        int[]arr1={1,0,0,1,0,1,0,1};
        int[]arr2={0,1,0,1,1,0,0,1};
        longestCommonSpanWithSameSum(arr1, arr2);
    }
}
