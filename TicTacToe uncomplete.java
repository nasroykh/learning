import java.util.Scanner;
public class learn {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("- Player 1 -  | X |");
        System.out.println("- Player 2 -  | O |");
        String[][] arr = {{"a", "b", "c"},{"d", "e", "f"},{"g", "h", "i"}};
        System.out.println("   |   |   ");
        System.out.println(" a | b | c ");
        System.out.println("---|---|---");
        System.out.println(" d | e | f ");
        System.out.println("---|---|---");
        System.out.println(" g | h | i ");
        System.out.println("   |   |   ");

        //-------------------------------------------------------

        System.out.print("- Player 1 -  Choose : ");
        String choice = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice)) {
                    arr[i][j] = "X";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 2 -  Choose : ");
        String choice2 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice2)) {
                    arr[i][j] = "O";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 1 -  Choose : ");
        String choice3 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice3)) {
                    arr[i][j] = "X";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 2 -  Choose : ");
        String choice4 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice4)) {
                    arr[i][j] = "O";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 1 -  Choose : ");
        String choice5 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice5)) {
                    arr[i][j] = "X";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 2 -  Choose : ");
        String choice6 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice6)) {
                    arr[i][j] = "O";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 1 -  Choose : ");
        String choice7 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice7)) {
                    arr[i][j] = "X";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 2 -  Choose : ");
        String choice8 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice8)) {
                    arr[i][j] = "O";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        System.out.print("- Player 1 -  Choose : ");
        String choice9 = type.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(choice9)) {
                    arr[i][j] = "X";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
        //-------------------------------------------------------
        if (((arr[0][0].equals(arr[1][1]))&&(arr[2][2].equals(arr[0][0]))) ||
                ((arr[0][0].equals(arr[1][0]))&&(arr[2][0].equals(arr[0][0]))) ||
                ((arr[0][0].equals(arr[0][1]))&&(arr[0][2].equals(arr[0][0]))) ||
                ((arr[0][1].equals(arr[1][1]))&&(arr[2][1].equals(arr[0][1]))) ||
                ((arr[0][2].equals(arr[1][2]))&&(arr[2][2].equals(arr[0][2]))) ||
                ((arr[1][0].equals(arr[1][1]))&&(arr[1][2].equals(arr[1][0]))) ||
                ((arr[2][0].equals(arr[2][1]))&&(arr[2][2].equals(arr[2][0]))) ||
                ((arr[0][2].equals(arr[1][1]))&&(arr[2][0].equals(arr[0][2]))))  {
            System.out.println("Congrats !");
        }
    }
}