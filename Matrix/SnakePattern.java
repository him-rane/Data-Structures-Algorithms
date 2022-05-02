package Matrix;

public class SnakePattern {
    public static void snakePattern(int[][]mat){
        int n=mat.length,m=mat[0].length;
        boolean reverse =false;
        for(int i=0;i<n;i++){
            if(!reverse){
                for(int j=0;j<m;j++){
                    System.out.print(mat[i][j]+" ");
                }
                reverse=!reverse;
            }else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
                reverse=!reverse;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int[][]mat = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12},
                      { 13, 14, 15, 16 } };
        snakePattern(mat);
    }
}
