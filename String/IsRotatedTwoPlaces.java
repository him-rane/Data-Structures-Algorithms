package String;

public class IsRotatedTwoPlaces {
    public static boolean isRotated(String str1, String str2){
        int n=str1.length();
        
        if(str1.charAt(0)==str2.charAt(n-2) && str1.charAt(1)==str2.charAt(n-1)){
            int i;
            for( i=2;i<n;i++){
                if(str2.charAt(i-2)!=str1.charAt(i))break;
            }
            if(i==n)return true;
        }
        
        if(str2.charAt(0)==str1.charAt(n-2) && str2.charAt(1)==str1.charAt(n-1)){
            int i;
            for( i=2;i<n;i++){
                if(str1.charAt(i-2)!=str2.charAt(i))break;
            }
            if(i==n)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="himanshu";
        String str2="shuhiman";

        System.out.println(isRotated(str1, str2)); 
        
    }
}
