package String;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1,String str2){
        // Your code here
        int n=str1.length();
        int m=str2.length();
        
        if(n!=m)return false;
        
        int[]map1=new int[256];
        int[]map2=new int[256];
        
        for(int i=0;i<n;i++){
            map1[str1.charAt(i)]++;
        }
        
        for(int i=0;i<n;i++){
            map2[str2.charAt(i)]++;
        }
        
        
        for(int i=0;i<n;i++){
            if(map1[str1.charAt(i)]!=map2[str2.charAt(i)])return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        String str1="ssb";
        String str2="rru";

        System.out.println(areIsomorphic(str1, str2));
    }
}
