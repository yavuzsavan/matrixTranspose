package Java;
import java.util.Arrays;

public class Main {


    public static void main(String[] args){
        int[][] matris = {{2,3,4},{5,6,4}};
        int[][] matris2= {{1,3,5},{7,9,11}};

        System.out.println(Arrays.deepToString(transpose(matris)));
        System.out.println(Arrays.deepToString(transpose(matris2)));
        }

    static int[][] transpose(int[][] arr){
        int[][] transposedMatrix = new int[arr[0].length][arr.length];
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                transposedMatrix[j][i] = arr[i][j];
            }
        }
        return transposedMatrix;
    }
}