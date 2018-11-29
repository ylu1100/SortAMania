public class Runner {
    public static void main(String[] args)
    {
        Team17SortCompetition name = new Team17SortCompetition();
        int numCount =  100;
        int[] challengeOneList = new int[numCount];
        challengeOneList = Team17SortCompetition.randIntArr(numCount);
        Team17SortCompetition.toString(challengeOneList);

        name.challengeOne(challengeOneList);
    }
}
