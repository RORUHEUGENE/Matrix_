import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //хочу чтобы пользователь задал размеры матрицы
        int[][] matr = createMatrixOfZeroes();
        printMatr(matr);
        randomize(matr);
        printMatr(matr);
        printLineSums(matr);
        printMaxElem(matr);
    }

    private static int[][] createMatrixOfZeroes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры матрицы");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matr = new int[n][m];
        return matr;
    }

    public static void printMatr(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf(" %3d", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void randomize(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                Random rn = new Random();
                int randomNum = rn.nextInt(100) ;
                matr[i][j] = randomNum;
            }
        }
    }

    //подсчитать и вывести сумму элементов в каждой строке матрицы
    public static void printLineSums(int[][] matr)
    {
        for (int i = 0; i < matr.length; i++) {
            int s = 0;
            for (int j = 0; j < matr[i].length; j++) {
                s += matr[i][j];
            }
            System.out.println("сумма элементов строки "+i+" равна "+s);
        }
    }

    //подсчитать и вывести максимальный элемент матрицы
    public static int printMaxElem(int[][] matr)
    {
        int s ;
        s = matr[0][0];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j]>s){
                 s = matr[i][j];
                }
                else if  (matr[i][j] == s){
                    s = s ;
                }
                else {
                    s=s;
                    }
                            }
            System.out.println("максимальный элементов матрицы равн "+s);
            return s;
        }
    }
}