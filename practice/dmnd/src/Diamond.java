import java.util.Scanner;

public class Diamond {
    public static void main(String args[])
    {
        int n, i, j, bosluk = 1;
        System.out.print("Yükseklik: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        bosluk = n - 1;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= bosluk; j++)
            {
                System.out.print(" ");
            }
            bosluk--;
            for (j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        bosluk = 1;
        for (i = 1; i <= n - 1; i++)
        {
            for (j = 1; j <= bosluk; j++)
            {
                System.out.print(" ");
            }
            bosluk++;
            for (j = 1; j <= 2 * (n - i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

