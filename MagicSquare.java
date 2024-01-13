import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Magic Square Class - Creates 2D array of integers from file
 * and validates if they are magic squares. Also creates magic
 * squares array from given input and prints to file
 */

public class MagicSquare implements MagicSquareInterface {

    private int numsides;
    private int magicNum;
    private int[][] matrixOrig;

    /**
     * Constructor for MagicSquare read from file
     * 
     * @param filename
     */
    public MagicSquare(String filename) {
        readMatrix(filename);
        numsides = n;
        matrixOrig = new int[n][n];
        magicNum = n * (n ^ 2 + 1) / 2; // TODO check if division gives correct result
    }

    /**
     * Constructor for MagicSquare read from commandline and writes to file
     * 
     * @param filename
     * @param dim
     */
    public MagicSquare(String filename, int dim) {
        Scanner kbd = new Scanner(); // TODO read from cmd line
        numsides = n;
        matrixOrig = new int[n][n];
        magicNum = n * (n ^ 2 + 1) / 2; // TODO check if division gives correct result

        // Print to new file
    }

    /**
     * Attempts to read file for first constructor
     * @param filename
     * @return matrix read from file
     */
    // TODO
    private int[][] readMatrix(String filename) {
        try {
            Scanner fileScan = new Scanner(filename);
            Scanner lineScan;
            return 
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }

    /**
     * Writes matrix to file
     * 
     * @param matrix
     * @param filename
     */
    // TODO
    private void writeMatrix(int[][] matrix, String filename) {

    }

    /**
     * Validate a given matrix to see if it is a magic square
     * 
     * @return true if the matrix is a magic square, otherwise false
     */
    // TODO
    @Override
    public boolean isMagicSquare() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMagicSquare'");
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
     * @return Formatted string of matrix with validation result
     */
    @Override
    public String toString() {
        String str = "";

        str += "The matrix\n"


        if (isMagicSquare() == true) {

        }

    }
}