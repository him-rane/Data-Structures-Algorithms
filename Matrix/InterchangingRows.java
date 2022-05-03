package Matrix;

public class InterchangingRows {
    static void interchangeRows(int mat[][])
    {
         for(int j=0;j<mat[0].length;j++){
            int i=0,k=mat.length-1;
            while(i<=k){
                int temp=mat[i][j];
                mat[i][j]=mat[k][j];
                mat[k][j]=temp;
                i++;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int[][]mat = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12},
                      { 13, 14, 15, 16 } };
        interchangeRows(mat);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
