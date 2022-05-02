package BitMagic;

public class PowerOfTwo {
    public static void main(String[] args) {
       System.out.println(isPowerOfTwo(24));
    }
    public static boolean isPowerOfTwo(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
            if(count>1)return false;
        }
        return true;
    }
}
