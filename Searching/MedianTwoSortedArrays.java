package Searching;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[]arr1 ={2, 3, 5, 8};
        int[]arr2 ={10, 12, 14, 16, 18, 20};
        System.out.println(median(arr1, arr2));
    }
    public static int median(int[]arr1,int[]arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        if(n1>n2)return median(arr2, arr1);

        int low=0;
        int high=n1;

        while(low<=high){
            int m1=(low+high)/2;
            int m2=((n1+n2+1)/2)-m1;

            int left1=m1>0?arr1[m1-1]:Integer.MIN_VALUE;
            int left2=m2>0?arr2[m2-1]:Integer.MIN_VALUE;

            int right1=m1<n1?arr1[m1]:Integer.MAX_VALUE;
            int right2=m2<n2?arr2[m2]:Integer.MAX_VALUE;


            if((left1<=right2)&&(left2<=right1)){
                if((n1+n2)%2==0)return (Math.max(left1, left2)+Math.min(right1, right2))/2;
                else return Math.max(left1, left2);
            }else if(left1>right2){
                high=m1-1;
            }else{
                low=m1+1;
            }
        }
        return -1;
    }

}
