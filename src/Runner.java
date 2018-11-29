public class Runner {
    public static void main(String[] args)
    {
        int numCount =  10000;
        Team17SortCompetition c1 = new Team17SortCompetition();
        Team17SortCompetition c2 = new Team17SortCompetition();

        int[] challengeOneList;
        int[] challengeThreeList;


        challengeOneList = Team17SortCompetition.randIntArr(numCount);
        challengeThreeList = Team17SortCompetition.randIntArr(numCount);
        Team17SortCompetition.toString(challengeOneList);

        c1.challengeOne(challengeOneList);
        c2.challengeThree(challengeThreeList);


    }
}
