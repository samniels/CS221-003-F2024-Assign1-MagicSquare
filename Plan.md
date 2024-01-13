# Background
- Magic square: Matrix where the values in each row, column, and diagonal add up to the same value or *magic number*
- To calculate the magic number of a given matrix, use the following: *n(n^2+1)/2*
- The max value in a given matrix will be n^2 (e.g. for n=4, 16 would be the highest value)

# Goal for Program
- Check an existing matrix to see if it passes magic squares test (any size)
- Create a magic square from a given *n*, must be odd
- Must run from the command line and take args: -check, -create


# Magic Square Class
- Vars
    - n - int - Num sides in matrix
    - magicNumber - int - Sum of vals in row/col/diag 
    - matrixOrig - 2D array of ints
    - matrixCopy - 2D array of ints, taken from original
- Constructor 1
    - Read from file and create a matrix
        - Private method readMatrix
- Constructor 2
    - Takes a filename and dimension n to create a matrix
        - Private method writeMatrix
- isMagicSquare
    - Validate if the matrix (Copy?) from the file is a magic square
        - Get val of first row, compare to rest
        - for row in rows, for col in cols, if sum of col vals in row are the same, continue
        - for col in cols, for row in rows, if sum of row vals in col are the same, continue
        - (naiively) 
    - If valid, return true, else false
- getMatrix
    - For row in rows, col in cols, val[row][col] of matrixCopy = val[row][col] of matrixOrig
    - Return matrixCopy
- toString
    - String str
    - If isMagicSquare == true,
        - str += "The matrix\n"
        - (matrixCopy) For row in rows, col in cols, str += val[row][col] + " "
            - str += "\n"
        - str += "is (not) a magic square"
    - Return str

# Magic Square Driver
- Scanner to detect user input from cmd line (try/catch)
- If input is -check
    - Scanner to try and open file and read (try/catch)
    - Scanner to read a given file and parse
    - Create matrix
    - matrix.toString to test
- If input is -create
    - Create matrix
    - matrix.toString to test
