package Sorting;



public class CountInversions {
    public static int merge(int[]arr,int low,int mid ,int high){
        int count=0;
        int n1=mid-low+1;
        int n2=high-mid;

        int[]left=new int[n1];
        int[]right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                
            }else{
                arr[k]=right[j];
                j++;
                count=count+(n1-i);
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return count;
    }
    public static int countInversions(int[]arr,int l,int r){
        int res=0;
        if(r>l){
            int m=(l+r)/2;
            res+=countInversions(arr,l,m);
            res+=countInversions(arr, m+1, r);
            res+=merge(arr, l, m, r);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={2,4,1,3,5};
        int res=countInversions(arr, 0, arr.length-1);
        System.out.println(res);
    }
}
