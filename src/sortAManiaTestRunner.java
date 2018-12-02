import java.util.Random;

public class sortAManiaTestRunner
{
    public static void main(String[] args)
    {
        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team6.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("ChallengeOne Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
    public static int[] randomIntsArr(int num)
    {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String[] randomStrings = new String[num];
        Random random = new Random();
        for(int i = 0; i < num; i++)
        {
            char[] word = new char[random.nextInt(length)];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println();
        }
    }
}
