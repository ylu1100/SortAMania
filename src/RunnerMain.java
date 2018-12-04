public class RunnerMain
{
    public static void main(String[] args)
    {
        SortCompetition team1 = new Team5SortCompetition();
        System.out.println(team1.greeting());
        System.out.println("\n");

        int[] randIntArrA = randomIntsArr(10000);
        int[] randIntArrB = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);
        int[][] rand2dArr = random2dArr(1000, 1000);
        Comparable[] randCompArr=randomCompArr(10000,10);

        System.out.println("CHALLENGE 1");

        System.out.println("Unsorted");
        printArr(randIntArrA, null, null, null);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randIntArrA);
        time = System.currentTimeMillis() - time;
        System.out.println();
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArrA, null, null, null);



        System.out.println("\n");
        System.out.println("CHALLENGE 2");

        System.out.println("Unsorted");
        printArr(null, randStringArr, null, null);

        time = System.currentTimeMillis();
        int found = team1.challengeTwo(randStringArr, "FUCK");
        time = System.currentTimeMillis() - time;
        System.out.println();
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Position of query: " + found);

        System.out.println("Sorted");
        printArr(null, randStringArr, null,null );



        System.out.println("\n");
        System.out.println("CHALLENGE 3");

        System.out.println("Unsorted");
        printArr(randIntArrB, null, null, null);

        time = System.currentTimeMillis();
        median = team1.challengeThree(randIntArrB);
        time = System.currentTimeMillis() - time;
        System.out.println();
        System.out.println("Challenge Three Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median: " + median);

        System.out.println("Sorted");
        printArr(randIntArrB, null, null, null);



        System.out.println("\n");
        System.out.println("CHALLENGE 4");

        System.out.println("Unsorted (first 5)");
        printArr(null, null, rand2dArr, null);

        time = System.currentTimeMillis();
        median = team1.challengeFour(rand2dArr);
        time = System.currentTimeMillis() - time;
        System.out.println();
        System.out.println("Challenge Four Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median: " + median);

        System.out.println("Sorted (first 5)");
        printArr(null, null, rand2dArr, null);



        System.out.println("\n");
        System.out.println("CHALLENGE 5");

        System.out.println("Unsorted");
        printArr(null, null, null, randCompArr);

        time = System.currentTimeMillis();
        //not actually a median, just a predefined var.
        median = team1.challengeFive(randCompArr, "hello");
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Five Time Taken: " + time * 0.001 + " Seconds");

        System.out.println("Sorted");
        printArr(null, null,null, randCompArr);
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

    public static Comparable[] randomCompArr(int num, int len)
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
        for(int i = 0; i < totlen; i++)
        {
            for(int j = 0; j < len - 1; j++)
            {
                arr[i][j] = (int)(Math.random() * 10000) + 1;
            }
        }
        return arr;
    }

    public static void printArr(int[] arr, String[] arr1, int[][] arr2, Comparable[] arr3)
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
            for(int i = 0; i < 5; i++)
            {
                for(int j = 0; j < arr2[i].length - 1; j++)
                    System.out.print(arr2[i][j] + " ");
                System.out.println();
            }
        }

        if (arr3 != null)
        {
           /* for(int i = 0; i < arr1.length - 1; i++)
                System.out.print(arr1[i] + " "); */
            int fluidLen=arr3.length-1;
            for(int i = 0; i < fluidLen/2; i++)
                System.out.print(arr3[i] + " ");
            for (int i=fluidLen/2; i<fluidLen; i++)
                System.out.print(arr3[i] + " ");
        }
    }
}
