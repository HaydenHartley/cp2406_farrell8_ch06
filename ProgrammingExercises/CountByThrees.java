public class CountByThrees
{
    public static void main(String args[])
    {
        int MIN = 3;
        int MAX = 300;
        int stepNum = 3;
        for (int i=MIN; i <= MAX; i = i+ stepNum)
        {
            System.out.print(i + " ");
            if (i % 30 == 0)
                System.out.println();
        }
    }
}