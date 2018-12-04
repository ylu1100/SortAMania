import java.util.Random;

public class sortAManiaTestRunner
{
    public static void main(String[] args)
    {
        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = randomIntsArr(3);
        int[] randIntArr2 = randomIntsArr(3);
        int[][] randIntMultiArr = randomIntsMultiArr(3,3);
        String[] randStringArr = randomStringArr(10, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team6.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("ChallengeOne Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

        System.out.println("Unsorted");
        printArr(randStringArr);

        median = team6.challengeTwo(randStringArr, "words");
        time = System.currentTimeMillis() - time;
        System.out.println("ChallengeTwo Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("String found at: " + median);

        System.out.println("Sorted");
        printArr(randStringArr);

        System.out.println("Unsorted");
        printArr(randIntArr2);

        median = team6.challengeThree(randIntArr2);
        time = System.currentTimeMillis() - time;
        System.out.println("ChallengeThree Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr2);

        System.out.println("Unsorted");
        printArr(randIntMultiArr);

        median = team6.challengeFour(randIntMultiArr);
        time = System.currentTimeMillis() - time;
        System.out.println("ChallengeFour Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntMultiArr);


        System.out.println("Unsorted");
        //printArr(randIntMultiArr);

        median = team6.challengeFive(randStringArr, "words");
        time = System.currentTimeMillis() - time;
        System.out.println("ChallengeFive Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("String found at: " + median);

        System.out.println("Sorted");
        //printArr(randIntMultiArr);
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

    public static int[][] randomIntsMultiArr(int num, int num2)
    {
        int[][] arr = new int[num][num2];
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                arr[i][j] = (int)(Math.random()*10000);
            }
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String[] randomStrings = new String[num];
        Random random = new Random();
        for(int i = 0; i < num; i++)
        {
            char[] word = new char[length];
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
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void printArr(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void printArr(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
