package String;
public class CheckForAnagram{
    public static boolean isAnagram(String s1,String s2){
        int map[]=new int[26];
        for(int i=0;i<s1.length();i++){
            map[97-s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            map[97-s2.charAt(i)]--;
            if(s2.charAt(i)<0)return false;
        }
        for(int i:map){
            if(i>0)return false;
        }

        return true;
        
    }
    public static void main(String[] args) {
        String s1="himanshu";
        String s2="rane";
        isAnagram(s1, s2);
    }
}