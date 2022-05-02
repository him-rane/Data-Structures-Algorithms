package Searching;

public class LastOccurrence {
    public static void main(String[] args) {
        int[]arr={8,9,9,9,9,9,5};
        int x=9;
        System.out.println(lastOccurrence(arr, x));
    }
    public static int lastOccurrence(int[]arr,int x){
        int res=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return res;
    }
}
