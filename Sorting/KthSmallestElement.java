package Sorting;

public class KthSmallestElement {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static int lomutoPartition(int[]arr,int low, int high){
        int  i=low-1;
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
    public static int kthSmallestElement(int[]arr,int k){
        int l=0,r=arr.length-1;
        while(l<=r){
            int p=lomutoPartition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={6,8,9,2,1,3,5,7};
        int p=kthSmallestElement(arr,2);
        System.out.println(arr[p]);
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
    }

}
