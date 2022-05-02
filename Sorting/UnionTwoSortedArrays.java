package Sorting;
public class UnionTwoSortedArrays{
    public static void main(String[] args) {
        int[]arr1={1,1,2,3,3,3,3,3,4};
        int[]arr2={1,2,2,2,3,4,5};
        union(arr1, arr2);
    }
    public static void union(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(i>0 && arr1[i]==arr1[i-1])i++;
            else if(j>0 && arr2[j]==arr2[j-1])j++;
            
            else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j]);
                j++;
            }
            else if(arr1[i]<arr2[j]){
               System.out.println(arr1[i]);
                 i++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<arr1.length)System.out.println(arr1[i++]);
        while(j<arr2.length)System.out.println(arr2[j++]);
    }
}