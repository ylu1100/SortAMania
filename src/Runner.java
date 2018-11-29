public class Runner {
    public static void main(String[] args)
    {
        //CHALLENGE 1
        Team17SortCompetition c1 = new Team17SortCompetition();
        int numCount = 6;
        int[] challengeOneList;

        challengeOneList = Team17SortCompetition.randIntArr(numCount);
        Team17SortCompetition.toString(challengeOneList);

        long start = System.currentTimeMillis();
        System.out.println("Median: " + c1.challengeOne(challengeOneList));
        long diff = System.currentTimeMillis() - start;
        System.out.println(diff + "\n");

        //CHALLENGE 2
        Team17SortCompetition c2 = new Team17SortCompetition();
        int numCount2 = 10;
        String[] challengeTwoList;

        challengeTwoList = Team17SortCompetition.randStringArr(numCount2,5);
        Team17SortCompetition.toString(challengeTwoList);
    }
}
