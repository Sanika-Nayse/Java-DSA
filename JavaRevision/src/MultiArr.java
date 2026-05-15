import java.util.Arrays;

public class MultiArr {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4,5,6}, {3,4,5}};
        int [][][] cube= {{{1,1,1}, {2,2,2}}, {{3,3,3}, {4,4,4}}};
        System.out.println("Matrix: "+ Arrays.deepToString(matrix));
        System.out.println("Cube: "+ Arrays.deepToString(cube));
        System.out.printf("Length of matrix: %d and Length of cube: %d\n", matrix.length, cube.length);
        System.out.println("cube[0][1][1]: "+cube[0][1][1]);
    }
}
