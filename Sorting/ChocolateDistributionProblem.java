package Sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static int chocolateDistribution(int[]arr,int k){
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=k-1;i<arr.length;i++){
            res=Math.min(arr[i]-arr[i-(k-1)], res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={10,40,60,65,70};
        int p= chocolateDistribution(arr,3);
        System.out.println(p);
        
    }
}
