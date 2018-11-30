import java.util.Random;

public class TestRunnerDeleteLater
{
    public static void main(String[] args)
    {

        SortCompetition team2 = new Team2SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time1 = System.nanoTime();
        int median = team2.challengeOne(randIntArr);
        time1 = System.nanoTime() - time1;
        System.out.println("Challenge One Time Taken: " + time1 * .000000001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

        System.out.println("Unsorted");
        printStringArray(randStringArr);

        long time2 = System.nanoTime();
        median = team2.challengeTwo(randStringArr,"ABCDE");
        time2 = System.nanoTime() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * .000000001 + " Seconds");
        System.out.println("First Instance: " + median);

        System.out.println("Sorted");
        printStringArray(randStringArr);

        System.out.println("\nChallenge 3");

        int[] c3 = new int[10];

        c3[0] = (int)(Math.random () * 10) + 1;
        for (int a = 1; a < c3.length; a++) {
            c3[a] = c3[a-1] + (int)(Math.random() * 12) - 2;
        }
        printArr(c3);
        System.out.println("Unsorted");
        long time3 = System.nanoTime();
        System.out.println(team2.challengeThree(c3) + " Median");

        time3 = System.nanoTime() - time3;
        System.out.println("Sorted");
        System.out.println(time2*.000000001 + " seconds");
        printArr(c3);

        System.out.println("Unsorted");
        int[][]array2d = random2dIntsArr(1000);
        printTable.print2D(array2d);

        long time4 = System.nanoTime();
        median = team2.challengeFour(array2d);
        time4 = System.nanoTime() - time4;

        System.out.println("Sorted");
        printTable.print2D(array2d);
        System.out.println("Median equals: " + median);
        System.out.println("Challenge Four Time Taken: " + time4 * .000000001 + " Seconds");

        System.out.println("Unsorted");
        Comparable[] c5 = new Comparable[10000];
        String[] t = randomStringArr(c5.length,2);
        for(int i = 0; i < c5.length; i++)
        {
            c5[i] = new test(t[i]);
        }
        String s = "";
        for(int i=0;i<c5.length;i++)
        {
            s+= c5[i] + " ";
        }
        System.out.println(s);
        String a = "HA";
        test c = new test(a);
        long time5 = System.nanoTime();
        System.out.println(team2.challengeFive(c5,c));
        time5 = System.nanoTime()-time5;
        s= "";
        for(int i=0;i<c5.length;i++)
        {
            s+= c5[i] + " ";
        }
        System.out.println(s);
        System.out.println(time5*.000000001 + " seconds");
        System.out.println();
        System.out.println("Challenge One Time Taken: " + time1 * .000000001 + " Seconds");
        System.out.println("Challenge Two Time Taken: " + time2 * .000000001 + " Seconds");
        System.out.println("Challenge Three Time Taken: " + time3 * .000000001 + " Seconds");
        System.out.println("Challenge Four Time Taken: " + time4 * .000000001 + " Seconds");
        System.out.println("Challenge Five Time Taken: " + time5 * .000000001 + " Seconds");
    }

    public static int[] randomIntsArr(int x)
    {
        int[] z = new int[x];
        for(int i=0;i<x;i++)
        {
            z[i] = (int)(Math.random()*10000);
        }
        return z;
    }

    public static int[][] random2dIntsArr(int n) {
        int[][] challengeFour = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                challengeFour[i][j] = random.nextInt(10000);
            }
        }
        return challengeFour;
    }

    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                s = s.toUpperCase();
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void printArr(int[] arr){
        String temp = "";
        for(int i=0;i<arr.length;i++){
            temp+= arr[i] + ", ";
        }
        System.out.println(temp);
    }

    public static void printStringArray(String[] arr){
        String temp = "";
        for(int i=0;i<arr.length;i++){
            temp+= arr[i] + ", ";
        }
        System.out.println(temp);
    }
}
