//Alexander Cox
//Wednesday, November 28, 2018

public class Runner {

    public static void main (String[] args)
    {
        Team16 runner = new Team16();
        int[] c1Arr = randIntArr(10000);
        String[] c2Arr = randomStringArr(10000, 5);

        //Challenge 1
        double startTime = System.nanoTime();
        System.out.println("Challenge 1\nMedian: " + runner.challengeOne(c1Arr));
        double endTime = (System.nanoTime() - startTime);
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        printIntArray(c1Arr);

        //Challenge 2
        startTime = System.nanoTime();
        System.out.println("Challenge 2");
        System.out.println("Index of String: " + runner.challengeTwo(c2Arr, "5000"));
        endTime = (System.nanoTime() - startTime);
        if (runner.challengeTwo(c2Arr, "5000") >= 0)
            System.out.println("String: " + c2Arr[runner.challengeTwo(c2Arr, "5000")]);
        else
            System.out.println("String: Not in Array");
        System.out.println("Time Taken: " + (endTime / 1000000000) + "s");
        printStringArray(c2Arr);

        //Challenge 3

        //Challenge 4

        //Challenge 5
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

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

    public static void printIntArray(int[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println("]\n");
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
}
