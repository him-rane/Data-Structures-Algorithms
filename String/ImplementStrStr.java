package String;

public class ImplementStrStr {
    public static void fillLPS(int[]lsp,String pat){
        int  m=pat.length();
        lsp[0]=0;
        int i=1,len=0;
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
    public static int KMP(String text,String pat){
        int n=text.length();
        int m=pat.length();

        int[]lps=new int[m];
        fillLPS(lps,pat);

        int i=0,j=0;
        while(i<n){
            if(text.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return i-j;
            }
            if(i<n && (text.charAt(i)!=pat.charAt(j))){
                if(j==0)i++;
                else j=lps[j-1];
            }
        }
        
        return -1;
    }

    public static int strstr(String s, String x)
    {
       // Your code here
       return KMP(s,x);
    }
    public static void main(String[] args) {
        String s="himanshu";
        String x="ans";
        System.out.println(strstr(s, x));
    }
}
