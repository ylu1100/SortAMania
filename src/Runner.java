//Alexander Cox
//Wednesday, November 28, 2018

import java.util.concurrent.ConcurrentMap;

public class Runner {

    public static void main (String[] args)
    {
        Team16 runner = new Team16();
        int[] c1Arr = randIntArr(10000);
        String[] c2Arr = randomStringArr(10000, 5);
        int[] c3Arr = randIntArr(100000);
        int[][] c4Arr = rand2DIntArr(1000, 1000);
        Comparable[] c5Arr = randomObjArr(10000);

        //Challenge 1
        System.out.println("Challenge 1");
        double startTime = System.nanoTime();
        System.out.println("Median: " + runner.challengeOne(c1Arr));
        double endTime = (System.nanoTime() - startTime);
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        //printIntArray(c1Arr);

        System.out.print("\n");

        //Challenge 2
        System.out.println("Challenge 2");
        startTime = System.nanoTime();
        System.out.println("Index of String: " + runner.challengeTwo(c2Arr, "words"));
        endTime = (System.nanoTime() - startTime);
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        //printStringArray(c2Arr);

        System.out.print("\n");

        //Challenge 3
        System.out.println("Challenge 3");
        startTime = System.nanoTime();
        System.out.println("Median: " + runner.challengeThree(c3Arr));
        endTime = (System.nanoTime() - startTime);
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        printIntArray(c3Arr);

        System.out.print("\n");

        //Challenge 4
        System.out.println("Challenge 4");
        startTime = System.nanoTime();
        System.out.println("Median: " + runner.challengeFour(c4Arr));
        endTime = (System.nanoTime() - startTime);
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        //print2dArray(c4Arr);

        System.out.print("\n");

        //Challenge 5
        System.out.println("Challenge 5");
        Thing obj = new Thing(3);
        startTime = System.nanoTime();
        System.out.println("Index of Query: " + runner.challengeFive(c5Arr, obj));
        endTime = (System.nanoTime() - startTime);
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        //printObjArray(c5Arr);
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        return arr;
    }

    public static int[][] rand2DIntArr(int cols, int rows)
    {
        int[][] arr = new int[cols][rows];

        for (int j = 0; j < arr.length; j++)
        {
            for (int i = 0; i < arr[j].length; i++)
                arr[j][i] = (int) (Math.random() * 10000);
        }

        return arr;
    }

    public static String[] randomStringArr(int count, int length)
    {
        String[] arr = new String[count];

        for (int i = 0; i < count; i++)
        {
            String str = "";
            for (int j = 0; j < length; j++)
            {
                char s = (char)((Math.random() * 26) + 97);
                str += s;
            }
            arr[i] = str;
        }

        return arr;
    }

    public static Comparable[] randomObjArr(int count)
    {
        Comparable[] arr = new Comparable[count];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Thing((int)(Math.random() * 10000));
        }

        return arr;
    }

    public static void printIntArray(int[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println("]\n");
    }

    private static void print2dArray(int[][] list)
    {
        for (int j = 0; j < list.length; j++)
        {
            System.out.print("[");
            for (int i = 0; i < list[j].length; i++)
            {
                System.out.print(list[i][j] + ", ");
            }
            System.out.println("]\n");
        }
    }

    public static void printStringArray(String[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println("]\n");
    }

    public static void printObjArray(Comparable[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i].toString() + ", ");
        }
        System.out.println("]\n");
    }
}
