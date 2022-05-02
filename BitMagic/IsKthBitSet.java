package BitMagic;

public class IsKthBitSet {
    public static boolean isKthBitSet(int n,int k){
        if(((n>>(k-1)) & 1)==1)return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isKthBitSet(13, 3));
    }
}
