package String;
public class PalindromeCheck {
    public static boolean isPalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="hih";
        System.out.println(isPalindrom(s));
    }
}
