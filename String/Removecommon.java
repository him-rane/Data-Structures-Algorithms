package String;
public class Removecommon {

    public static String concatenatedString(String s1,String s2){
        // Your code here
        int[]map1=new int[256];
        int[]map2=new int[256];
       
        for(int i=0;i<s1.length();i++){
            map1[s1.charAt(i)]++;
        }
        
        for(int i=0;i<s2.length();i++){
            map2[s2.charAt(i)]++;
        }
        
        String ans="";
        for(int i=0;i<s1.length();i++){
            if(map1[s1.charAt(i)]!=0 && map2[s1.charAt(i)]==0){
                
                 ans=ans+s1.charAt(i);
            }
        }
         for(int i=0;i<s2.length();i++){
            if(map1[s2.charAt(i)]==0 && map2[s2.charAt(i)]!=0){
                 ans=ans+s2.charAt(i);
            }
        }
        
    
        if(ans.length()==0)return "-1";
       
        return  ans;
        
    }
    public static void main(String[] args) {
        String s1="Himanshu";
        String s2="Rane";

        System.out.println(concatenatedString(s1, s2));
    }
}
