public class runner
{
    public static void main(String[] args)
    {
        Team18SortCompetition x = new Team18SortCompetition();
/*
        int[] c1 = generateIntArr(7);
        printIntArray(c1);
 */
        long timer = System.nanoTime();
 /*
        System.out.println("median is " + x.challengeOne(c1));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

        String[] c2 = {"bacon","apple","dog","cat","fruit","chicken", "spaghetti", "mirshahiduzzaman", "pigsblood", "loopers"};
        printStringArray(c2);
        timer = System.nanoTime();
        System.out.println(x.challengeTwo(c2,"chicken"));
        timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");
        printStringArray(c2);
*/
        int[][] c3 = generate2IntArr(10,10);
        print2dArr(c3);
        System.out.println(x.challengeFour(c3));

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
    public static int[][] generate2IntArr(int x, int y)
    {
        int[][] arr = new int[x][y];
        for(int i = 0; i<x; i++)
        {
            for(int j = 0; j<y; j++)
            {
                arr[i][j] = (int) (Math.random()*10000);
            }
        }
        return arr;
    }
    public static void print2dArr(int[][] arr)
    {
        String temp = "";
        for(int i=0; i<arr.length;i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                temp+=arr[i][j] + ", ";
            }
        }
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

