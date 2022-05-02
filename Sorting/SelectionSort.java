package Sorting;

public class SelectionSort {
    public static void main(String[]arg){
        int[]arr={4,3,2,7,8,1,2,9,6,4,7};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void selectionSort(int[]arr){
        int  n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr, i, min); 
        }
    }
}
