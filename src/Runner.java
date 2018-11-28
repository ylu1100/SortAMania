public class Runner
{
    public static int[] array = new int[10000];
    public static String[] alphaArray = new String[10000];
    public static String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static void main(String[] args)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            array[i] = (int)(Math.random() * 10000) + 1;
        }
        alphaArray = alphaMake(10, 10000);
        double startTime = System.currentTimeMillis();
        System.out.println(SortCompetition.challengeOne(array));
        double endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort took " + (endTime - startTime) + " milliseconds.");
        startTime = System.currentTimeMillis();
        Team5SortCompetition.challengeTwo(array);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort took " + (endTime - startTime) + " milliseconds.");
        startTime = System.currentTimeMillis();
        Team5SortCompetition.challengeThree(array);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort took " + (endTime - startTime) + " milliseconds.");
    }

    public static String[] alphaMake(int num, int len)
    {
        String[] arr = new String[num];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while(i < len)
            {
                char c = (char)((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
