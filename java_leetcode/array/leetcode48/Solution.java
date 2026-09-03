package java_leetcode.array.leetcode48;

public class Solution {
    public static int[][] rotate(int[][] matrix) {
        int length = matrix.length;
        System.out.println(matrix.length + " "  + matrix[0].length);
        int[][] newMatrix = new int[length][length];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                newMatrix[j][length - 1 - i] = matrix[i][j]; 
                // System.out.println(i + " " + j);
            }
        }
        return newMatrix;
        
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        
        for (int[] is : rotate(matrix)) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println(" ");
        }

    }
}

/*
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
*/