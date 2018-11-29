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
        Team5SortCompetition a = new Team5SortCompetition();

        double startTime = System.currentTimeMillis();
        System.out.println(a.challengeOne(array));
        double endTime = System.currentTimeMillis();
        System.out.println("C1 took " + (endTime - startTime) + " milliseconds.");

        for(int i = 0; i < array.length - 1; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        System.out.println("");
        startTime = System.currentTimeMillis();
        String[] arr= stringArrs();
        System.out.println("je");
        System.out.println(a.challengeTwo(arr, "je"));
        endTime = System.currentTimeMillis();
        System.out.println("C2 took " + (endTime - startTime) + " milliseconds.");

        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + " ");
        }


        startTime = System.currentTimeMillis();
        System.out.println(a.challengeThree(array));
        endTime = System.currentTimeMillis();
        System.out.println("C3 took " + (endTime - startTime) + " milliseconds.");

        for(int i = 0; i < array.length - 1; i++)
        {
            System.out.print(array[i] + " ");
        }
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

    public static String[] stringArrs()
    {
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr=new String[10000];
        for(int i=0; i<10000; i++)
        {
            String stringStor=alphabet.substring((int)(Math.random()*25), alphabet.length()-1);
            arr[i]=stringStor;
        }
        return arr;
    }

}
