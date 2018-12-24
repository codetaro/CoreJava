public class JavaArrayInitialization {

    // examples for initializing an array in javacontinue
    public static void main(String[] args) {
        // initialize primitive one dimensional array
        int[] arrInt = new int[5];

        // initialize Object one dimensional array
        String[] strArr;
        strArr = new String[4];

        // initialize multidimensional array
        int[][] twoArrInt = new int[4][5];

        // multidimensional array initialization with only leftmost dimension
        int[][] twoIntArr = new int[2][];
        // complete initialization is required before we use the array
        twoIntArr[0] = new int[2];
        twoIntArr[1] = new int[3];

        // array initialization using shortcut syntax
        int[] arrI = {1, 2, 3};
        int[][] arrI2 = {{1, 2}, {1, 2, 3}};

        /* strongly discourage */
        int[][] twoArrInt1 = new int[4][5];
        int[][] twoIntArr2 = new int[5][];
    }
}
