package Sorting;

public class LomutoPartition {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int lomutoPartition(int[]arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];

        for(int j=0;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public static void main(String[] args) {
        int[]arr={3,23,24,11,2,5,1,4,3,7,5,1,9};
        int k=4;
        System.out.println(lomutoPartition(arr, 0,arr.length-1));
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
