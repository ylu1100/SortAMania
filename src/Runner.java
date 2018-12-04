public class Runner {
    public static void main(String[] args)
    {
        int[] rand = new int[10000];
        for (int i=0; i< rand.length;i++)
        {
            rand[i] = (int)(Math.random()*rand.length);
            //System.out.println("Array at postion ("+i+")" +rand[i]);
        }

        long timeStart = System.currentTimeMillis();
        int median = Team15SortCompetition.c1(rand);
        long timeEnd = System.currentTimeMillis() - timeStart;

        System.out.println("Sorted in: "+ timeEnd+ "ms");
        System.out.println("Sorted in: "+ timeEnd*0.001 + " seconds");
        System.out.println("The median is: "+ median);

        for (int i=0; i< rand.length;i++)
        {
           //System.out.println("Array at postion ("+i+")" +rand[i]);
        }


        int[] mostlyRand = new int[100000];
        for (int i=0; i< mostlyRand.length;i++)
        {
            if (i < 75000)
            {
                mostlyRand[i] = i;
            } else {
                mostlyRand[i] = (int)(Math.random()*rand.length);
            }

            //System.out.println("Array at postion ("+i+")" +rand[i]);
        }
        timeStart = System.currentTimeMillis();
        median = Team15SortCompetition.c3(mostlyRand);
        timeEnd = System.currentTimeMillis() - timeStart;

        for (int i=0; i < mostlyRand.length; i++)
        {
            // System.out.println("Array at postion ("+i+")" +mostlyRand[i]);
        }
        System.out.println("Sorted in: "+ timeEnd+ "ms");
        System.out.println("Sorted in: "+ timeEnd*0.001 + " seconds");
        System.out.println("The median is: "+ median);

        int twoDArr[][] = new int[1000][1000];
        for (int i=0 ; i < twoDArr.length; i++)
        {
            for (int n=0; n < twoDArr[i].length; n++)
            {
                twoDArr[i][n] = (int)((Math.random()*100000)+1);
            }
        }

        timeStart = System.currentTimeMillis();
        median = Team15SortCompetition.c4(twoDArr);
        timeEnd = System.currentTimeMillis() - timeStart;

        System.out.println("Sorted in: "+ timeEnd+ "ms");
        System.out.println("Sorted in: "+ timeEnd*0.001 + " seconds");
        System.out.println("The median is: "+ median);


    }
}
