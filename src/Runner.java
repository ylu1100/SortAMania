public class Runner {
    public static void main(String[] args)
    {
        //CHALLENGE 1
        Team17SortCompetition c1 = new Team17SortCompetition();
        int[] challengeOneList = Team17SortCompetition.randIntArr(10000);
        System.out.println("unsorted");
        Team17SortCompetition.toString(challengeOneList);

        long start = System.nanoTime();
        System.out.println("Median: " + c1.challengeOne(challengeOneList));
        long diff = System.nanoTime() - start;
        System.out.println("Time Taken: " + diff + "\n");

        System.out.println("sorted");
        Team17SortCompetition.toString(challengeOneList);
        System.out.println();

        //CHALLENGE 2
        Team17SortCompetition c2 = new Team17SortCompetition();
        String[] challengeTwoList = Team17SortCompetition.randStringArr(10000,5);
        System.out.println("unsorted");
        Team17SortCompetition.toString(challengeTwoList);

        start = System.nanoTime();
        System.out.println("Found Idx: " + c2.challengeTwo(challengeTwoList,challengeTwoList[0]));
        diff = System.nanoTime() - start;
        System.out.println("Time Taken: " + diff + "\n");


        System.out.println("sorted");
        Team17SortCompetition.toString(challengeTwoList);
        System.out.println();

        //CHALLENGE 3
        Team17SortCompetition c3 = new Team17SortCompetition();
        int[] challengeThreeList = Team17SortCompetition.randIntArr(1000);
        System.out.println("unsorted");
        Team17SortCompetition.toString(challengeThreeList);

        start = System.nanoTime();
        System.out.println("Median: " + c3.challengeThree(challengeThreeList));
        diff = (System.nanoTime() - start);

        System.out.println("Time Taken: " + diff + "\n");
        System.out.println("sorted");
        Team17SortCompetition.toString(challengeThreeList);
        System.out.println();

        //CHALLENGE 4
        Team17SortCompetition c4 = new Team17SortCompetition();
        int count = 10;
        int[][] challengeFourList = new int[count][count];

        for(int i = 0;i<challengeFourList.length;i++)
        {
            challengeFourList[i] = Team17SortCompetition.randIntArr(count);
        }
        System.out.println("unsorted");
        Team17SortCompetition.toString(challengeFourList);

        start = System.nanoTime();
        System.out.println("Median: " + c4.challengeFour(challengeFourList));
        diff = System.nanoTime() - start;

        System.out.println("Time Taken: " + diff + "\n");
        System.out.println("sorted");
        Team17SortCompetition.toString(challengeFourList);
        System.out.println();

        //CHALLENGE 5
        Team17SortCompetition c5 = new Team17SortCompetition();
        count = 10;
        Thing[] challengeFiveList = new Thing[count];
        String out = "";
        for(int i = 0;i<challengeFiveList.length;i++)
        {
            challengeFiveList[i] = new Thing();
            out += challengeFiveList[i].value + " id: " + challengeFiveList[i].id + ", ";
        }
        System.out.println(out);

         start = System.currentTimeMillis();
        System.out.println("Index found: " + c5.challengeFive(challengeFiveList,challengeFiveList[0]));
         diff = System.currentTimeMillis() - start;
        out = "";

        for(int i =0;i<challengeFiveList.length;i++)
        {
            out += challengeFiveList[i].value + " id: " + challengeFiveList[i].id;
            if(i != challengeFiveList.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);
        System.out.println("Time Taken: " + diff + "\n");


    }
}
