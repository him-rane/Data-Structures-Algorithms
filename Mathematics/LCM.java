package Mathematics;

public class LCM extends HCF{
    public static void main(String[] args) {
        System.out.println( LCM_naive(11, 13));
        System.out.println( LCM_efficient(11, 13));
    }
    public static int LCM_naive(int a,int b){
        int res=Math.max(a, b);
        while(res<a*b){
            if(res%a==0 && res%b==0)return res;
            res++;
        }
        return a*b;
    }

    public static int LCM_efficient(int a,int b){
        return (a*b)/euclidean(a, b);
    }

}
