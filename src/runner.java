public class runner
{
    public static void main(String[] args)
    {
        Team18SortCompetition x = new Team18SortCompetition();

        int[] c1 = generateIntArr(6);

        printIntArray(c1);

        long timer = System.nanoTime();

        System.out.println("median is " + x.challengeOne(c1));

        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        printIntArray(c1);




        String[] c2 = {"abcde","cdefe","aaaaa","bbbbb"};
        printStringArray(c2);
        timer = System.nanoTime();
        System.out.println(x.challengeTwo(c2,"abcde"));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        printStringArray(c2);
    }

    public static int[] generateIntArr(int x)
    {
        int[] z = new int[x];
        for(int i=0;i<x;i++)
        {
            z[i] = (int)(Math.random()*10000);
        }
        return z;
    }
    }
}
