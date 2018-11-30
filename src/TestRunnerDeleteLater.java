public class TestRunnerDeleteLater
{
    public static void main(String[] args)
    {

        SortCompetition team2 = new Team2SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.nanoTime();
        int median = team2.challengeOne(randIntArr);
        time = System.nanoTime() - time;
        System.out.println("Challenge One Time Taken: " + time * .000000001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

        System.out.println("Unsorted");
        printStringArray(randStringArr);

        time = System.nanoTime();
        median = team2.challengeTwo(randStringArr,"ABCDE");
        time = System.nanoTime() - time;
        System.out.println("Challenge Two Time Taken: " + time * .000000001 + " Seconds");
        System.out.println("First Instance: " + median);

        System.out.println("Sorted");
        printStringArray(randStringArr);

        System.out.println("Unsorted");
        printStringArray(generate2DIntArr);

        time = System.nanoTime();
        median = team2.challengeFour(generate2DIntArr());
        time = System.nanoTime() - time;
        System.out.println("Challenge Two Time Taken: " + time * .000000001 + " Seconds");
        System.out.println("First Instance: " + median);

        System.out.println("Sorted");
        printStringArray(randStringArr);
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
