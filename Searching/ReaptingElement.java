package Searching;

public class ReaptingElement {
    public static void main(String[] args) {
        int[]arr={4,1,2,3,5,5};
      // System.out.println(reaptingElement(arr));
       System.out.println(reaptingElement2(arr));
    }
    //modifi the array
    // public static int reaptingElement(int[]arr){
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
        
    //         int idx=Math.abs(arr[i]);
    //         if(arr[idx]<0)return idx;
    //         if(arr[idx]==0)arr[idx]=0;
    //         else arr[idx]=-arr[idx];
    //     }
    //     return 0;
    // }

    //without modify the array
    public static int reaptingElement2(int[]arr){
        int slow=arr[0],fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);

        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }

        return slow;
    }
}
