package assignments.june09;

public class TransposeMatrix {

    public static void main(String[] args) {
        // Original matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Get rows and columns
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose matrix will have dimensions cols x rows
        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display original matrix
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Display transpose matrix
        System.out.println("\nTranspose Matrix:");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
