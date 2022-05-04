package Hashing;

import java.util.HashSet;

public class SubarrayWithGivenSum {
    public static boolean subarrayWithGivenSum(int[]arr,int sum){
        HashSet<Integer>set=new HashSet<>();
        int preSum=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(preSum==sum)return true;
            if(set.contains(preSum-sum))return true;
            set.add(preSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int sum=16;
        System.out.println(subarrayWithGivenSum(arr,sum));
    }
}
