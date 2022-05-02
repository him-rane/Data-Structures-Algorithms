package Searching;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[]arr={8,9,9,9,9,9};
        int x=9;
        System.out.println(firstOccurresnce(arr, x));
        
    }
    public static int firstOccurresnce(int[]arr,int x){
        int low=0;
        int high=arr.length-1;

        int  res=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                high=mid-1;
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
