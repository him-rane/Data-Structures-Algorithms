package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={1,7,2,9,19,3,6,7,4,5,11,6};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int[]arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            MergeFunction.mergeFunction(arr, l, m, r);
        }
    }
    
}
