public class Runner {
    public static void main(String[] args)
    {
        int numCount =  100;
        int[] challengeOneList = new int[numCount];
        Team17SortCompetition name = new Team17SortCompetition(challengeOneList);


        challengeOneList = Team17SortCompetition.randIntArr(numCount);
        Team17SortCompetition.toString(challengeOneList);

        name.challengeOne(challengeOneList);
    }
}
