package Searching;

public class PairSum {
    public static void main(String[] args) {
        
        int[]arr={2,4,6,7,9,12,14};
        int sum=21;
        pairSum(arr, sum);
    }
    public static void pairSum(int[]arr,int sum){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            if(arr[low]+arr[high]==sum){
                System.out.println(arr[low]+" "+arr[high]);
                return;
            }
            if(arr[low]+arr[high]>sum){
                high--;
            }else low++;

        }
        System.out.println(-1);
    }
}
