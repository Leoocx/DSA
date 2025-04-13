public class Main {

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] arr = new int[columns][rows];

        for (int i=0;i<columns;i++){
            for (int j=0;j<rows;j++){
             arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}