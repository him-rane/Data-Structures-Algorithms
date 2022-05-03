package Matrix;

public class ReversingColumns {
    static void reverseCol(int mat[][]){    
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
    }
    public static void main(String[] args) {
        int[][]mat = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12},
                      { 13, 14, 15, 16 } };
        reverseCol(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

