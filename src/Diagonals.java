public class Diagonals {
    static int diagonalDifference(int[] [] arr) {
    int leftCorner = 0;
    int rightCorner = 0;

    int rows = arr.length;
    int columns = arr[0].length;

    int i = 0;
    int j = 0;
    int k = 0;
    int l = arr.length-1;

    while(i< rows && j< columns && k < rows && 1 >= 0) {
        leftCorner += arr[i][k];
        rightCorner += arr[k][l];
        i += l;
        }
    return Math.abs(leftCorner - rightCorner);
    }
}
