import java.util.Arrays;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex13_Matrix {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    matrix[1][1] = 1;
    matrix[2][2] = 1;
    matrix[3][3] = 1;
    matrix[3][3] = 1;

    printer(matrix);
  }
  public static void printer (int[][] array){
    for (int[] x : array){
      for (int y : x){
        System.out.print(y + " ");
      }
      System.out.println();
    }
  }
}

