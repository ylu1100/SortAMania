public class Runner {
    public static void main(String[] args)
    {
        System.out.println("Challenge 1");
        Team1SortCompetition x = new Team1SortCompetition();

        int[] c1 = generateIntArr(5);

        printIntArray(c1);

        long timer = System.nanoTime();

        System.out.println("median is " + x.challengeOne(c1));

        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        printIntArray(c1);

        System.out.println("\nChallenge 2");

        String[] c2 = randomStringArr(10000,5);
        printStringArray(c2);
        timer = System.nanoTime();
        System.out.println(x.challengeTwo(c2,"abcde"));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        printStringArray(c2);


        int[] c3 = {1,2,3,4,5,6,7,8,11,15,17,19,12,14,16,10,9,13,18};
        printIntArray(c3);
        timer = System.nanoTime();
        System.out.println(x.challengeThree(c3));

        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");
        printIntArray(c3);

        int[][] c4 =  {
                {3,2,1},
                {1,3,2},
                {2,3,1},
        };

        x.challengeFour(c4);


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
