public class Runner {
    public static void main(String[] args)
    {
        System.out.println("Challenge 1");
        Team1SortCompetition x = new Team1SortCompetition();

        int[] c1 = generateIntArr(10000);
        System.out.println("Unsorted");
        printIntArray(c1);

        long timer = System.nanoTime();

        System.out.println("median is " + x.challengeOne(c1));

        timer = System.nanoTime() - timer;
        System.out.println("Sorted");
        printIntArray(c1);
        System.out.println(timer*.000000001 + " seconds");



        System.out.println("\nChallenge 2");

        String[] c2 = randomStringArr(10000,5);
        printStringArray(c2);
        timer = System.nanoTime();
        System.out.println("Unsorted");

        System.out.println(x.challengeTwo(c2,"abcde"));
        timer = System.nanoTime() - timer;
        System.out.println("Sorted");
        System.out.println(timer*.000000001 + " seconds");

        printStringArray(c2);

        System.out.println("\nChallenge 3");

        int[] c3 = new int[100000];

        c3[0] = (int)(Math.random () * 10) + 1;
        for (int a = 1; a < c3.length; a++) {
            c3[a] = c3[a-1] + (int)(Math.random() * 12) - 2;
        }

        System.out.println("Unsorted");
        printIntArray(c3);
        timer = System.nanoTime();
        System.out.println(x.challengeThree(c3) + " Median");

        timer = System.nanoTime() - timer;

        System.out.println(timer*.000000001 + " seconds");
        System.out.println("Sorted");
        printIntArray(c3);

        System.out.println("\nChallenge 4");
        int[][] c4 =  generate2DIntArr(10000);

        timer = System.nanoTime();

        System.out.println(x.challengeFour(c4));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        System.out.println("\nChallenge 5");
        Comparable[] c5 = new Comparable[10000];
        String[] t = randomStringArr(c5.length,2);
        for(int i=0;i<c5.length;i++)
        {
            c5[i] = new test(t[i]);
        }

        String s= "";
        for(int i=0;i<c5.length;i++)
        {
            s+= c5[i] + " ";
        }
        System.out.println(s);
        timer = System.nanoTime();
        String a = "HA";
        test c = new test(a);
        System.out.println(x.challengeFive(c5,c));
        timer = System.nanoTime()-timer;
        s= "";
        for(int i=0;i<c5.length;i++)
        {
            s+= c5[i] + " ";
        }
        System.out.println(s);
        System.out.println(timer*.000000001 + " seconds");
    }



    public static int[] generateIntArr(int x)
    {
        int[] z = new int[x];
        for(int i=0;i<x;i++)
        {
            z[i] = (int)(Math.random()*10000);
        }
        return z;
    }

    public static int[][] generate2DIntArr(int x){
        int[][] z = new int[x][x];
        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[i].length;j++){
                z[i][j] = (int)(Math.random()*10001);
            }
        }
        return z;
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

    public static void printIntArray(int[] arr){
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
