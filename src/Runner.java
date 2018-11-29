public class Runner {
    public static void main(String[] args)
    {
        Team17SortCompetition c1 = new Team17SortCompetition();
        int numCount =  100;
        int[] challengeOneList;

        challengeOneList = Team17SortCompetition.randIntArr(numCount);
        Team17SortCompetition.toString(challengeOneList);

        c1.challengeOne(challengeOneList);
    }
}
