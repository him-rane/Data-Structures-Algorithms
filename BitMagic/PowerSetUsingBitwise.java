package BitMagic;

public class PowerSetUsingBitwise {
    public static void main(String[] args) {
        printSubSet("abc");
    }
    public static void printSubSet(String s){
        int n=s.length();
        for(int counter=0;counter<Math.pow(2, n);counter++){
            int idx=0,j=counter;
            String temp="";
            
            while(j>0){
                if((j&1)==1)temp=temp+s.charAt(idx);
                idx++;
                j=j>>1;       
            }
            System.out.println(temp);
        }
    }
}
