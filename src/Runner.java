public class Runner {
    public static void main(String[] args) {
        SortCompetition team3 = new Team3SortCompetition();
        int[] randIntarr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printarr(randIntarr);

        long time1 = System.nanoTime();
        int median = team3.challengeOne(randIntarr);
        time1 = System.nanoTime() - time1;
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printarr(randIntarr);

        long time2 = System.nanoTime();
        median = team3.challengeTwo(randStringArr,"ABCDE");
        time2 = System.nanoTime() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * .000000001 + " Seconds");
        System.out.println("First Instance: " + median);

        System.out.println("Sorted");
        printarr(randStringArr);

        System.out.println("\nChallenge 3");

        int[] c3 = new int[10];

        c3[0] = (int)(Math.random () * 10) + 1;
        for (int a = 1; a < c3.length; a++) {
            c3[a] = c3[a-1] + (int)(Math.random() * 12) - 2;
        }
        printarr(c3);
        System.out.println("Unsorted");
        long time3 = System.nanoTime();
        System.out.println(team3.challengeThree(c3) + " Median");

        time3 = System.nanoTime() - time3;
        System.out.println("Sorted");
        System.out.println(time2*.000000001 + " seconds");
        printarr(c3);
        /**
        System.out.println("Unsorted");
        int[][]array2d = random2dIntsArr(1000);
        printTable.print2D(array2d);

        long time4 = System.nanoTime();
        median = team3.challengeFour(array2d);
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
        System.out.println(team3.challengeFive(c5,c));
        time5 = System.nanoTime()-time5;
        s= "";
        for(int i=0;i<c5.length;i++)
        {
            s+= c5[i] + " ";
        }

        System.out.println(s);
        System.out.println(time5*.000000001 + " seconds");
        System.out.println();
         */
        System.out.println("Challenge One Time Taken: " + time1 * .000000001 + " Seconds");
        System.out.println("Challenge Two Time Taken: " + time2 * .000000001 + " Seconds");
        System.out.println("Challenge Three Time Taken: " + time3 * .000000001 + " Seconds");
        /*
        System.out.println("Challenge Four Time Taken: " + time4 * .000000001 + " Seconds");
        System.out.println("Challenge Five Time Taken: " + time5 * .000000001 + " Seconds");
        */
    }

    /*
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
    }
    */
    public static String[] randomStringArr(int arrLength, int wordLength){
        String [] randStringArray = new String[arrLength];
        String chars = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String temp = "";
        for(int i = 0;i<arrLength;i++){
            temp = "";
            for(int j = 0;j<wordLength;j++){
                temp += chars.charAt((int)(Math.random() * (chars.length())));
            }
            randStringArray[i] = temp;
        }
        return randStringArray;
    }

    public static int[] randomIntsArr(int length){
        int[] randIntArr = new int[length];
        for(int i = 0;i<length;i++){
            randIntArr[i] = (int)(Math.random() * length)+1;
        }
        return randIntArr;
    }

    public static void printarr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }

    public static void printarr(String[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }

}