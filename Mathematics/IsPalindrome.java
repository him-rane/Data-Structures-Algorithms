package Mathematics;

public class IsPalindrome {
    public static void main(String[] args) {
        int n=1235321;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        int reverse=0;
        int temp=n;
        while(temp>0){
            reverse=(reverse*10)+temp%10;
            temp=temp/10;
        }
       
        return n==reverse;
    }
    
}
