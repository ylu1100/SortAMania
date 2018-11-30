public class TestRunnerDeleteLater
{
    public static void main(String[] args)
    {

        SortCompetition team2 = new Team2SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team2.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;

    }
}
