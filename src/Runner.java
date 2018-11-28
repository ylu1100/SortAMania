public class Runner {
    public static void main(String[] args)
    {
        Team1SortCompetition x = new Team1SortCompetition();

        int[] c1 = generateIntArr(6);

        printIntArray(c1);

        long timer = System.nanoTime();

        System.out.println("median is " + x.challengeOne(c1));

        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        printIntArray(c1);




        String[] c2 = {"abcde","cdefe","aaaaa","bbbbb"};
        printStringArray(c2);
        timer = System.nanoTime();
        System.out.println(x.challengeTwo(c2,"abcde"));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        printStringArray(c2);
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
