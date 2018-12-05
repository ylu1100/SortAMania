public class Runner {
    public static void main(String [] args)
    {
        SortCompetition team1 = new Team10SortCompetition();
        int[] randIntArr = randomIntsArr(100000);
        String[] ranStringArr = randomStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(ranStringArr);

        long time= System.currentTimeMillis();
        int median = team1.challengeTwo(ranStringArr,"apple");
        time = System.currentTimeMillis() - time;
        System.out.println("challenge One Time Taken: " + time * 0.001 + "seceonds");
        System.out.println("Median equals: " + median);

        System.out.println("sorted");
        printArr(ranStringArr);
    }
    public static int[] randomIntsArr(int amount)
    {
        int tempArr[] = new int[amount];
        for (int i = 0; i < amount; i++)
        {
            tempArr[i] = (int) (Math.random() * 10000);
        }
        return tempArr;
    }
    public static String[] randomStringArr(int amount1, int length)
    {
        String tempArr1[] = new String[amount1];
        String Letters[] = new String[25];
        String Alphabet = "abcdefghijklmnopqrstuvwxyz";
        String tempString = "";
        int current = 0;
        for(int z =0;z<Letters.length;z++)
        {
            Letters[z] = Alphabet.substring(z,z+1);
        }
        while(!(amount1 == current))
        {
            for(int i = 0;i<tempArr1.length;i++) {
                for (int b = 0; b < length; b++) {
                    tempString += Letters[((int) (Math.random() * Letters.length))];
                }
                tempArr1[i] += tempString;
            }
            current++;
        }
        return tempArr1;
    }
    public static void printArr(String[]Arr)
    {
        String array = "";
        for(int i =0;i<Arr.length;i++)
        {
            array += String.valueOf(Arr[i]);
            array += " ";
        }
        System.out.println(array);
    }
}
