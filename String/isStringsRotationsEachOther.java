package String;

public class isStringsRotationsEachOther {
    public static void fillLSP(String pat,int[]lsp){
        int m=pat.length();
        
        lsp[0]=0;
        int len=0,i=1;
        
        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lsp[i]=len;
                i++;
            }else{
                if(len==0){
                    lsp[i]=0;
                    i++;
                }else len=lsp[len-1];
            }
        }
    }
    public static boolean KMP(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        
        int[]lsp=new int[n];
        fillLSP(pat,lsp);
        
        int i=0,j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;j++;
            }
            if(j==m)return true;
            
            if(i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j==0)i++;
                else j=lsp[j-1];
            }
        }
        return false;
    }
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length()!=s2.length())return false;
        return KMP(s1+s1 , s2);
    }
    public static void main(String[] args) {
        String s1="himanshu";
        String s2="shuhiman";

        System.out.println(areRotations(s1, s2));
        
    }
}
