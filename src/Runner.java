public class Runner {
    public static void main(String[] args)
    {
        Team9SortingCompetition t = new Team9SortingCompetition();
        int[] e = getRndIntArr(0,10000,10000);
        String[] s = getRndStringArr(1000,5);
        int[][] doubleArr = new int[1000][1000];
        Comparable[] c = getRndComparableArr(1,1000,10000);
        int[] mostlySorted = getRndIntArr(0,10, 100000);
        for(int i = 0; i < 1000; i++)
        {
            doubleArr[i] = getRndIntArr(0,10000, 1000);
        }
        System.out.println(c[10] + " " + c[20]);
        System.out.println(t.challengeOne(e));
        System.out.println(t.challengeTwo(s,"apple"));
        long l = System.currentTimeMillis();
        System.out.println(t.challengeThree(mostlySorted));
        long p = System.currentTimeMillis();
        System.out.println((p-l)*0.001 + " seconds");
        l = System.currentTimeMillis();
        System.out.println(t.challengeFour(doubleArr));
        p = System.currentTimeMillis();
        System.out.println((p-l)*0.001);
        //System.out.println(c[t.challengeFive(c,c[10])]);


    }
    public static int[] getRndIntArr(int min, int max, int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }
    public static Thing[] getRndComparableArr(int min, int max, int length)
    {
        Thing[] arr = new Thing[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = new Thing((int) Math.floor(Math.random() * (max - min + 1)) + min);
        }
        return arr;
    }
    public static String[] getRndStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while(num > 0) {
            int i = 0;
            String s = "";
            while(i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
