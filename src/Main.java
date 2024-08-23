import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        game();
    }

    static void game() {
        Scanner scanner = new Scanner(System.in);
        String[][] field = initializeField();
        String currentPlayer = "x";
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (isValidMove(x, y, field)) {
                field[x - 1][y - 1] = currentPlayer;
                printField(field);
                if (checkWin(field, currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = currentPlayer.equals("x") ? "o" : "x";
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    static String[][] initializeField() {
        String[][] field = new String[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "#";
            }
        }
        return field;
    }

    static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isValidMove(int x, int y, String[][] field) {
        if (x < 1 || x > 3 || y < 1 || y > 3) {
            return false;
        }
        return field[x - 1][y - 1].equals("#");
    }


    static boolean checkWin(String[][] field, String player) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0].equals(player) && field[i][1].equals(player) && field[i][2].equals(player)) {
                return true;
            }
            if (field[0][i].equals(player) && field[1][i].equals(player) && field[2][i].equals(player)) {
                return true;
            }
        }
        if (field[0][0].equals(player) && field[1][1].equals(player) && field[2][2].equals(player)) {
            return true;
        }
        if (field[0][2].equals(player) && field[1][1].equals(player) && field[2][0].equals(player)) {
            return true;
        }
        return false;
    }
}
