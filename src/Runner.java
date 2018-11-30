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
        System.out.println(diff + "\n");

        //CHALLENGE 2
        Team17SortCompetition c2 = new Team17SortCompetition();
        String[] challengeTwoList = Team17SortCompetition.randStringArr(10,5);

        Team17SortCompetition.toString(challengeTwoList);

        /*start = System.currentTimeMillis();
        System.out.println("Median: " + c2.challengeTwo(challengeTwoList));
        diff = System.currentTimeMillis() - start;
        System.out.println(diff + "\n");*/

        //CHALLENGE 3
        Team17SortCompetition c3 = new Team17SortCompetition();
        int[] challengeThreeList = Team17SortCompetition.randIntArr(6);

        Team17SortCompetition.toString(challengeThreeList);

        start = System.currentTimeMillis();
        System.out.println("Median: " + c3.challengeThree(challengeThreeList));
        diff = System.currentTimeMillis() - start;
        System.out.println(diff + "\n");

        //CHALLENGE 4

        //CHALLENGE 5
    }
}
