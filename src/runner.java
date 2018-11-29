public class runner
{
    public static void main(String[] args)
    {
        Team18SortCompetition x = new Team18SortCompetition();

        int[] c1 = generateIntArr(7);

        printIntArray(c1);

        long timer = System.nanoTime();
/*
        System.out.println("median is " + x.challengeOne(c1));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");
*/
        String[] c2 = {"bacon","apple","dog","cat"};
        printStringArray(c2);
        timer = System.nanoTime();
        System.out.println(x.challengeTwo(c2,"dog"));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");
        printStringArray(c2);
/*
        int[] c3 = generateIntArr(10);
        printIntArray(c3);
        timer = System.nanoTime();
        System.out.println(x.challengeThree(c3));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");
*/
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

