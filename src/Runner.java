public class Runner {
    public static void main(String [] args)
    {
        SortCompetition team1 = new Team10SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] ranStringArr = randomStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time= System.currentTimeMillis();
        int median = team1.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("challenge One Time Taken: " + time * 0.001 + "seceonds");
        System.out.println("Median equals: " + median);

        System.out.println("sorted");
        printArr(randIntArr);
    }
    public static int[] randomIntsArr(int amount)
    {
        int tempArr[] = new int[amount];
        for (int i = 0; i < amount; i++)
        {
            tempArr[i] = (int) (Math.random() * 10000);
        }
        return tempArr;
    }
    public static String[] randomStringArr(int amount1, int length)
    {
        String tempArr1[] = new String[amount1];
        String Letters[] = new String[25];
        Letters = [A,B.C.]
        for (int i = 0; i < amount1; i++)
        {
            tempArr1[i] = ;
        }
        return tempArr1;
    }
}
