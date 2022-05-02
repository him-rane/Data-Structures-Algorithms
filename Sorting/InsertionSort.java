package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1,8,8,9,1};
        insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    
    }
    public static void insertionSort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i;
            while(j>0 && key<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
        }       
    }
}
