import java.util.Scanner;
import java.util.Random;
public class learn {
    public static void main(String[] args) {
        int guessCount = 0;
        Scanner type = new Scanner(System.in);
        Random rand = new Random();
        int g_num = rand.nextInt(51);
        System.out.print("Enter a number : ");
        int guess = type.nextInt();
        guessCount++;
        while (guess != g_num) {
            check(guess,g_num);
            guessCount++;
            guess = type.nextInt();
        }
        if (guessCount==1) {
            System.out.println("WOW ! You got in on the first try, CONGRATS !");
        }
        else {
            System.out.println("Congratulations ! You guessed it after "+guessCount+" tries.");
        }

    }
    private static void check(int guess, int g_num) {
        if (guess < g_num) {
            System.out.print("It's higher than that !\nRe-Enter a number : ");
        }
        else if (guess > g_num) {
            System.out.print("It's lower than that !\nRe-Enter a number : ");
        }
    }
}
