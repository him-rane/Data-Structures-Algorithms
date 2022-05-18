package String;

public class Anagram {
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length())return false;
        int[]map=new int[256];
        for(int i=0;i<a.length();i++){
            map[a.charAt(i)]++;
        }
        for(int i=0;i<b.length();i++){
            map[b.charAt(i)]--;
            if(map[b.charAt(i)]<0)return false;
        }
        for(int i=0;i<256;i++){
            if(map[i]>0)return false;
        }
       return true;
        
    }
    public static void main(String[] args) {
        String a="him";
        String b="mih";
        System.out.println(isAnagram(a,b));
    }
}
