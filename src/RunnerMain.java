public class RunnerMain
{
    public static void main(String[] args)
    {
        SortCompetition team1 = new Team5SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr, null);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr, null);

        System.out.println(" ");

        System.out.println("Unsorted");
        printArr(null, randStringArr);

        time = System.currentTimeMillis();
        int found = team1.challengeTwo(randStringArr, "FUG");
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Position of query: " + found);

        System.out.println("Sorted");
        printArr(null, randStringArr);
    }

    private static int[] randomIntsArr(int num)
    {
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
        {
            arr[i] = (int)(Math.random() * 10000) + 1;
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int len)
    {
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] arr = new String[num];
        for(int i = 0; i < num; i++)
        {
            arr[i] = "";
            for(int j = 0; j < len; j++)
                arr[i] += alphabet[(int) (Math.random() * alphabet.length - 1)];
        }
        return arr;
    }

    public static void printArr(int[] arr, String[] arr1)
    {
        if(arr1 == null)
        {
            for(int i = 0; i < arr.length - 1; i++)
                System.out.print(arr[i] + " ");
        }
        else
        {
            for(int i = 0; i < arr1.length - 1; i++)
                System.out.print(arr1[i] + " ");
        }
    }
}
