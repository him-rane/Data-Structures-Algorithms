package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqual0sAnd1s {
    public static int longestSubarrayWithEqual0sAnd1s(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)arr[i]=-1;
        }
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
        int[]arr={0,1,0,1,0,0,0,1,0,1,0};
        
        System.out.println(longestSubarrayWithEqual0sAnd1s(arr));

    }
}
