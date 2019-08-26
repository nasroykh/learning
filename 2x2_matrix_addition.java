import java.util.Scanner;
public class learn {
    public static void main(String[] args) {
        int[][] mtx = new int[2][2];
        int[][] mtx2 = new int[2][2];
        int[][] mtx3 = new int[2][2];
        Scanner type = new Scanner(System.in);
        System.out.println("First matrix");
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print("Enter a number : ");
                mtx[i][j] = type.nextInt();
            }
        }
        System.out.println("Second matrix");
        for (int i = 0; i < mtx2.length; i++) {
            for (int j = 0; j < mtx2[i].length; j++) {
                System.out.print("Enter a number : ");
                mtx2[i][j] = type.nextInt();
            }
        }
        for (int i = 0; i < mtx3.length; i++) {
            for (int j = 0; j < mtx3[i].length; j++) {
                mtx3[i][j] = mtx[i][j] + mtx2[i][j];
        }
        }
        System.out.print("the result matrix is : ");
        for (int i = 0; i < mtx2.length; i++) {
            for (int j = 0; j < mtx2[i].length; j++) {
                System.out.print(mtx3[i][j] + "|");
            }
        }
    }
}
