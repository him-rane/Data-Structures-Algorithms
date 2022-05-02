package Sorting;

public class SortTwoTypesOfElements {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static int segregateNegativePositive(int[]arr){
        int i=-1, j=arr.length;
        while(true){
            do{
                i++;
            }while(arr[i]<0);
            do{
                j--;
            }while(arr[j]>0);

            if(i>=j)return j;

            swap(arr, i, j);
        }
    }
    public static void main(String[] args) {
        int[]arr={1,-2,-3,4,-5,-6,7,8,9};
        segregateNegativePositive(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
