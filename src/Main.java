import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        game();
    }

    static void game()
    {
        Scanner scanner = new Scanner(System.in);
        printfield(scanner.nextInt(), scanner.nextInt(), "x");
    }
    static void printfield(int x, int y, String player)
    {
        int runs = 0;
        String[][] field = new String[3][3];
        if(runs==0)
        {
            for(int i=0;i<field.length;i++)
            {
                for(int j=0;j<field[2].length;j++)
                {
                    field[i][j] = "#";
                }
            }
            runs++;
        }
        try {
            field[x-1][y-1]=player;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {
            System.out.println("Bitte gültiges Feld eingeben (1 1-3 3)");
            Scanner scanner = new Scanner(System.in);
            printfield(scanner.nextInt(), scanner.nextInt(), player);
        }

        for(int i=0;i<field.length;i++)
        {
            for(int j=0;j<field[2].length;j++)
            {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }
    static String movehistory(int x, int y, String currentplayer)
    {
        int runs = 0;
        int[] X = new int[8];
        int[] O = new int[8];
        if(runs==0)
        {
            for(int i = 0; i<X.length; i++)
            {
                X[i]=0;
                O[i]=0;
            }
            runs++;
        }
        return (null);
    }

}