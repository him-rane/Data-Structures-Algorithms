package Matrix;

public class SearchInSortedMatrix {
    public static void searchInSortedMatrix(int[][]mat,int target){
        int i=0,j=mat[0].length-1;
        while(j>=0 && i<mat.length){
            if(mat[i][j]==target){
                System.out.print(i+" "+j);
                return;
            }
            if(mat[i][j]<target)i++;
            else j--;
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int[][]mat = {  
                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9,10,11,12 },
                        {13,14,15,16 } 
                    };
        int target=12;
        searchInSortedMatrix(mat, target);
    }
}
