package String;

public class ReverseWordsInString {
    public static String reverse(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            res=s.charAt(i)+res;
        }
        return res;
    }
    public static String reverseWordsInString(String s){
        int start=0;
        String ans="";
      
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans=(s.substring(start, i))+" "+ans;
                start=i+1;
            }
        }
    
        ans=ans+(s.substring(start));
        return ans;
    }
    public static void main(String[] args) {
        String s="my name is him";
        System.out.println( reverseWordsInString(s));
    }
}
