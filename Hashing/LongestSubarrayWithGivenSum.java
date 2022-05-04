package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {
    public static int longestSubarrayWithGivenSum(int[]arr,int sum){
        int res=0;
        int preSum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(preSum==sum)res=i+1;
            if(map.containsKey(preSum-sum))res=Math.max(res, i-map.get(preSum-sum));
            if(!map.containsKey(preSum))map.put(preSum, i);   
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={3,-1,1,1,8,2,3,6};
        int sum=9;
        System.out.println(longestSubarrayWithGivenSum(arr, sum));

    }
}
