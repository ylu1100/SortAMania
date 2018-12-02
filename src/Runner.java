public class Runner {
    public static void main(String[] args)
    {
        //CHALLENGE 1
        Team17SortCompetition c1 = new Team17SortCompetition();
        int[] challengeOneList = Team17SortCompetition.randIntArr(6);

        Team17SortCompetition.toString(challengeOneList);

        long start = System.currentTimeMillis();
        System.out.println("Median: " + c1.challengeOne(challengeOneList));
        long diff = System.currentTimeMillis() - start;

        System.out.println("Time Taken: " + diff + "\n");

        //CHALLENGE 2
        Team17SortCompetition c2 = new Team17SortCompetition();
        String[] challengeTwoList = Team17SortCompetition.randStringArr(10000,5);
                //{"yoyoy","omgma","justi","cando","youyo","alst","catss","juan","classic",
                // "silly"};

        Team17SortCompetition.toString(challengeTwoList);

        start = System.currentTimeMillis();
        System.out.println("Found Idx: " + c2.challengeTwo(challengeTwoList,challengeTwoList[0]));
        diff = System.currentTimeMillis() - start;

        System.out.println("Time Taken: " + diff + "\n");

        //CHALLENGE 3
        Team17SortCompetition c3 = new Team17SortCompetition();
        int[] challengeThreeList = Team17SortCompetition.randIntArr(6);

        Team17SortCompetition.toString(challengeThreeList);

        start = System.currentTimeMillis();
        System.out.println("Median: " + c3.challengeThree(challengeThreeList));
        diff = System.currentTimeMillis() - start;

        System.out.println("Time Taken: " + diff + "\n");

        //CHALLENGE 4
        Team17SortCompetition c4 = new Team17SortCompetition();
        int count = 3;
        int[][] challengeFourList = new int[count][count];

        for(int i = 0;i<challengeFourList.length;i++)
        {
            challengeFourList[i] = Team17SortCompetition.randIntArr(count);
        }

        Team17SortCompetition.toString(challengeFourList);

        start = System.currentTimeMillis();
        System.out.println("Median: " + c4.challengeFour(challengeFourList));
        diff = System.currentTimeMillis() - start;

        System.out.println("Time Taken: " + diff + "\n");
        //CHALLENGE 5
        Team17SortCompetition c5 = new Team17SortCompetition();
        count = 5;
        int[] challengeFiveList = new int[count];

        for(int i = 0;i<challengeFiveList.length;i++)
        {
            challengeFiveList = Team17SortCompetition.randIntArr(count);
        }

    }
}
