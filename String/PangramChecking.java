package String;

public class PangramChecking {
    public static boolean checkPangram  (String str) {
        int[]map= new int[256];
        int n=str.length();
        
        for(int i=0;i<n;i++){
            map[Character.toLowerCase(str.charAt(i))]++;
        }
        
        for(int i=97;i<=122;i++){
            if(map[i]==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="qazwsxedcwsxrfvtgbyhnujmik,ol.";
        System.out.println(checkPangram(str));
    }
}
