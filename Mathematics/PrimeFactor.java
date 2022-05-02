package Mathematics;

public class PrimeFactor {
    public static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2||n==3)return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 && n%(i+2)==0)return false;
        }
        return true;
    }
    public static void primeFactor_Naive(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                while( n>0 && n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
    }

    public static void primeFactor_Eff(int n){
        if(n<=1)return;
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3)System.out.println(n);
    }

    
    public static void main(String[] args) {
        primeFactor_Eff(96);
    }


}
