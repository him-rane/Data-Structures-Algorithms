package String;

public class Isogram {
    static boolean isIsogram(String data){
        int[]map=new int[256];
        for(int i=0;i<data.length();i++){
            map[data.charAt(i)]++;
            if(map[data.charAt(i)]>1)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String data="him";
        System.out.println(isIsogram(data));
        
    }

}
