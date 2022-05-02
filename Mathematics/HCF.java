package Mathematics;

public class HCF {
    public static void main(String[] args) {
        System.out.println(HCF_naive(26,52));
        System.out.println(euclidean(26,52));
    }
    public static int HCF_naive(int a,int b){
        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                return res;
            }
            res--;
        }
        return res;
    }
    
    public static int euclidean(int a ,int b){
        if(b==0)return a;
        else return euclidean(b, a%b);
    }
}
