package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean pairWithGivenSum(int[]arr,int sum){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(sum-arr[i]))return true;
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={2,4,1,6,8,2};
        int sum=8;
        System.out.println(pairWithGivenSum(arr, sum));
    }
}
