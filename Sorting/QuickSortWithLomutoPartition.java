package Sorting;

public class QuickSortWithLomutoPartition {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static int lomutoPartition(int[]arr,int low ,int high){
        int k=arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(arr[j]<k){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int p=lomutoPartition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static void main(String[] args) {
        int[]arr={1,3,4,5,6,3,2,0,2,8,1};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
