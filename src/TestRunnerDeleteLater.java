import java.util.Random;

public class TestRunnerDeleteLater
{
    public static void main(String[] args)
    {

        SortCompetition team2 = new Team2SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        System.out.println("Unsorted");
        printArr(randIntArr);
        long time1start = System.nanoTime();
        int median1 = team2.challengeOne(randIntArr);
        long time1end = System.nanoTime();
        long time1net = time1end - time1start;
        System.out.println("Challenge One Time Taken: " + time1net/1000000 + " Milli-Seconds");
        System.out.println("Median equals: " + median1);
        System.out.println("Sorted");
        printArr(randIntArr);

        String[] randStringArr = randomStringArr(10000,5);
        System.out.println("Unsorted");
        printStringArray(randStringArr);
        long time2start = System.nanoTime();
        int median2 = team2.challengeTwo(randStringArr,"ABCDE");
        long time2end = System.nanoTime();
        long time2net = time2end - time2start;
        System.out.println("Challenge Two Time Taken: " + time2net/1000000 + " Milli-Seconds");
        System.out.println("First Instance: " + median2);
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
        long time3start = System.nanoTime();
        System.out.println(team2.challengeThree(c3) + " Median");
        long time3end = System.nanoTime();
        long time3net = time3end - time3start;
        System.out.println("Sorted");
        System.out.println(time3net/1000000 + " milliseconds");
        printArr(c3);

        System.out.println("Unsorted");
        int[][]array2d = random2dIntsArr(1000);
        printTable.print2D(array2d);
        long time4start = System.nanoTime();
        int median4 = team2.challengeFour(array2d);
        long time4end = System.nanoTime();
        long time4net = time4end - time4start;
        System.out.println("Sorted");
        printTable.print2D(array2d);
        System.out.println("Median equals: " + median4);
        System.out.println("Challenge Four Time Taken: " + time4net/1000000  + " Milli-Seconds");

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
        long time5start = System.nanoTime();
        System.out.println(team2.challengeFive(c5,c));
        long time5end = System.nanoTime();
        long time5net = time5end - time5start;
        s= "";
        for(int i=0;i<c5.length;i++)
        {
            s+= c5[i] + " ";
        }
        System.out.println(s);
        System.out.println(time5net/1000000 + " seconds");
        System.out.println();

        System.out.println("Challenge One Time Taken: " + time1net/1000000 + " Milli-Seconds");
        System.out.println("Challenge Two Time Taken: " + time2net/1000000 + " Milli-Seconds");
        System.out.println("Challenge Three Time Taken: " + time3net/1000000 + " Milli-Seconds");
        System.out.println("Challenge Four Time Taken: " + time4net/1000000 + " Milli-Seconds");
        System.out.println("Challenge Five Time Taken: " + time5net/1000000 + " Milli-Seconds");
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
