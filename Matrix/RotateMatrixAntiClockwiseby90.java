package Matrix;

public class RotateMatrixAntiClockwiseby90 {
    public static void rotateMatrixAntiClockwiseby90(int[][]mat){
        for(int i=0;i<mat.length;i++){
            int j=0,k=mat[0].length-1;
            while(j<=k){
                int temp=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=temp;
                j++;
                k--;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
    }
    public static void main(String[] args) {
        int[][]mat = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12},
                      { 13, 14, 15, 16 } };
        rotateMatrixAntiClockwiseby90(mat);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
