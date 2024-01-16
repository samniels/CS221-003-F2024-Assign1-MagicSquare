import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Magic Square Class - Creates 2D array of integers from file
 * and validates if they are magic squares. Also creates magic
 * squares array from given input and prints to file
 * 
 * @author samniels
 */

public class MagicSquare implements MagicSquareInterface {

    private int numsides;
    private int magicNum;
    private int[][] matrixOrig;
    private boolean isMagicSquare;

    /**
     * Constructor for MagicSquare read from file only
     * Calls private method readMatrix which returns the matrix/array from file
     * 
     * @param filename
     */
    public MagicSquare(String filename) {
        matrixOrig = readMatrix(filename);
        isMagicSquare = false;
    }

    /**
     * Constructor for MagicSquare read from commandline and written to file
     * Calculates digits for each space in matrix
     * 
     * @param filename
     * @param dim
     */
    public MagicSquare(String filename, int dim) {
        int n = dim;
        matrixOrig = new int[n][n];
        int row = n - 1;
        int col = n / 2;

        int oldRow;
        int oldCol;

        // Create matrix - fill with numbers 1 through n^2, without repeats
        for (int i = 1; i < Math.pow(n, 2) + 1; i++) {
            matrixOrig[row][col] = i;
            oldRow = row;
            oldCol = col;
            row++;
            col++;

            // Check if number is already in matrix
            if (row == n) {
                row = 0;
            }
            if (col == n) {
                col = 0;
            }

            // Check if space is already filled
            if (matrixOrig[row][col] > 0) {
                row = oldRow;
                col = oldCol;
                row--;
            }
        }
        // Print to file
        writeMatrix(matrixOrig, filename);
    }

    /**
     * Attempts to read file for first constructor
     * 
     * @param filename
     * @return matrix read from file
     */
    // TODO doesnt recognize return statement bc its in try/catch
    private int[][] readMatrix(String filename) {
        File file = new File("test.txt");
        int[][] matrix;

        try {
            Scanner fileScan = new Scanner(file);
            String line = fileScan.nextLine();
            Scanner lineScan = new Scanner(line);

            // Read first line (dimension only)
            int dim = lineScan.nextInt();
            matrix = new int[dim][dim];

            // Read remaining lines of file
            for (int row = 0; row < dim; row++) {
                line = fileScan.nextLine();
                lineScan = new Scanner(line);

                // Read each digit in the line and add to matrix
                for (int col = 0; col < dim; col++) {
                    matrix[row][col] = lineScan.nextInt();
                }
                lineScan.close();
            }
            fileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open: " + filename);
            System.out.println(e.getMessage());
        }
        return matrix;
    }

    /**
     * Writes given matrix and its dimension to file
     * 
     * @param matrix
     * @param filename
     */
    private void writeMatrix(int[][] matrix, String filename) {
        int n = matrix.length;

        File file = new File(filename);
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(file));

            outFile.println(n);

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    outFile.print(matrixOrig[r][c] + " ");
                }
                outFile.println();
            }

            outFile.close();
        } catch (IOException o) {
            System.out.println("Unable to print to: " + filename);
            System.out.println(o.getMessage());
        }
    }

    /**
     * Validate a given matrix to see if it is a magic square
     * Note: Dimensions must be odd (3, 5, 7...)
     * 
     * @return true if the matrix is a magic square, otherwise false
     */
    // TODO
    @Override
    public boolean isMagicSquare() {
        int dim = matrixOrig.length;
        int magicNum = dim * (dim * dim + 1) / 2;

        for (int row = 0; row < dim; row++) {
            for (int col = 0; col < dim; col++) {
                // sum of row - see sodasurvey

            }
        }
    }

    /**
     * Returns a copy of the given matrix
     * 
     * @return 2D array of ints, NOT VALIDATED
     */
    // TODO test
    @Override
    public int[][] getMatrix() {
        int[][] matrixCopy = new int[matrixOrig.length][matrixOrig.length];

        for (int row = 0; row < matrixOrig.length; row++) {
            for (int col = 0; col < matrixOrig.length; col++) {
                matrixCopy[row][col] = matrixOrig[row][col];
            }
        }
        return matrixCopy;
    }

    /**
     * Returns formatted string of matrix with validation result
     * 
     * @return Formatted string of matrix with validation result
     */
    @Override
    public String toString() {
        String str = "";
        str += "The matrix\n";

        if (isMagicSquare() == true) {

        }

    }
}