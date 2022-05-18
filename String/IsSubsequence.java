package String;

public class IsSubsequence {
    public static boolean isSubsequence(String s1,String s2){
        int n1=s1.length(),n2=s2.length();
        int i=0,j=0;
        while(i<n1){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
                if(j==n2)return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[]args){
        String s1="himanshu";
        String s2="hihu";
        System.out.println(isSubsequence(s1, s2));
    }
}
