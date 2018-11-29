public class Runner {
    public static void main(String[] args)
    {
        Team17SortCompetition cOne = new Team17SortCompetition();
        int numCount =  100;
        int[] challengeOneList = new int[numCount];
        challengeOneList = Team17SortCompetition.randIntArr(numCount);
        Team17SortCompetition.toString(challengeOneList);

        cOne.challengeOne(challengeOneList);
        System.out.println(cOne.findMed(challengeOneList));
    }
}
