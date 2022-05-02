package Sorting;

public class BubbleSort {
   
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void bubbleSort(int[]arr){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            boolean isSorted=true;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);
                    isSorted=false;
                }
            }
            if(isSorted)break;
        }
    }
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
