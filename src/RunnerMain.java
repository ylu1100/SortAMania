public class RunnerMain
{
    public static void main(String[] args)
    {
        SortCompetition team1 = new Team5SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);
        int[][] rand2dArr = random2dArr(1000, 1000);

        System.out.println("CHALLENGE 1");

        System.out.println("Unsorted");
        printArr(randIntArr, null, null);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr, null, null);



        System.out.println("\n");
        System.out.println("CHALLENGE 2");

        System.out.println("Unsorted");
        printArr(null, randStringArr, null);

        time = System.currentTimeMillis();
        int found = team1.challengeTwo(randStringArr, "FUG");
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Position of query: " + found);

        System.out.println("Sorted");
        printArr(null, randStringArr, null);



        System.out.println("\n");
        System.out.println("CHALLENGE 3");

        System.out.println("Unsorted");
        printArr(randIntArr, null, null);

        time = System.currentTimeMillis();
        median = team1.challengeThree(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Three Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median: " + median);

        System.out.println("Sorted");
        printArr(randIntArr, null, null);



        System.out.println("\n");
        System.out.println("CHALLENGE 4");

        System.out.println("Unsorted");
        printArr(null, null, rand2dArr);

        time = System.currentTimeMillis();
        median = team1.challengeFour(rand2dArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median: " + median);

        System.out.println("Sorted");
        printArr(null, null, rand2dArr);
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

    public static int[][] random2dArr(int totlen, int len)
    {
        int[][] arr = new int[totlen][len];
        for(int i = 0; i < totlen - 1; i++)
        {
            for(int j = 0; j < len - 1; j++)
            {
                arr[i][j] = (int)(Math.random() * 10000) + 1;
            }
        }
        return arr;
    }

    public static void printArr(int[] arr, String[] arr1, int[][] arr2)
    {
        if(arr != null)
        {
            for(int i = 0; i < arr.length - 1; i++)
                System.out.print(arr[i] + " ");
        }

        if(arr1 != null)
        {
            for(int i = 0; i < arr1.length - 1; i++)
                System.out.print(arr1[i] + " ");
        }

        if(arr2 != null)
        {
            for(int i = 0; i < 1; i++)
            {
                for(int j = 0; j < arr2.length - 1; j++)
                    System.out.print(arr2[i][j] + " ");
            }
        }
    }
}
