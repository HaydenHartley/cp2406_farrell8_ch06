import java.util.Scanner;
public class CountByAnything
{
    public static void main(String args[])
    {
        int MIN;
        int MAX;
        int stepBy;
        int line = 0;
        int newline = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a starting integer: ");
        MIN = input.nextInt();

        System.out.print("Enter an ending integer: ");
        MAX = input.nextInt();

        System.out.print("Enter a stepping value: ");
        stepBy = input.nextInt();

        for (int i=MIN; i <= MAX; i = i+ stepBy)
        {
            System.out.print(i + " ");
            if (line == newline)
                System.out.println();
                line = 0;
            line++;

        }
    }
}