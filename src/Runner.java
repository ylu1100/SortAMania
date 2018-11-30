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
        String[] challengeTwoList = {"yoyoy","omgma","justi","cando","youyo","alst","catss","juan","classic","silly"};//Team17SortCompetition.randStringArr(10,5);

        Team17SortCompetition.toString(challengeTwoList);

        start = System.currentTimeMillis();
        System.out.println("Found Idx: " + c2.challengeTwo(challengeTwoList,"classic"));
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
        int[][] challengeFourList = new int[10][1];

        for(int i = 0;i<challengeFourList.length;i++)
        {
            challengeFourList[i] = Team17SortCompetition.randIntArr(1);//Team17SortCompetition.randStringArr(10,5);

            Team17SortCompetition.toString(challengeFourList[i]);
        }

        start = System.currentTimeMillis();
        System.out.println(c4.challengeFour(challengeFourList));
        diff = System.currentTimeMillis() - start;

        System.out.println("Time Taken: " + diff + "\n");

        //CHALLENGE 5
    }
}
