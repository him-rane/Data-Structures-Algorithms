package Sorting;
public class QuickSortWithHoarePartition {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static int hoarePartition(int[]arr,int low ,int high){
        int k=arr[low];
        int i=low-1;
        int j=high+1;
        while(true){
            do{i++;}while(arr[i]<k);
            do{j--;}while(arr[j]>k);
            if(i>=j)return j;
            swap(arr, i, j);
        }
    }
    public static void quickSort(int[]arr,int low ,int high){
        if(low<high){
            int p=hoarePartition(arr, low, high);
            quickSort(arr, low, p);
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
