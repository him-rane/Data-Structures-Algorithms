package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={1,4,5,8,9,10,14,18,19};
        int target=4;
       System.out.println(binarySearch(arr, target));
       System.out.println(binarySearchRec(arr, target, 0, arr.length-1));
    }
    public static int binarySearch(int[]arr,int target){
        
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static int binarySearchRec(int[]arr,int target,int low ,int  high){

        int mid=low+(high-low)/2;

        if(low>high)return -1;

        if(target==arr[mid])return mid;

        if(target>arr[mid])return binarySearchRec(arr, target, mid+1, high);
        else return binarySearchRec(arr, target, low, mid-1);
    }
}
