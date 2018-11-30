public class RunnerMain {
    public static void main(String[] args)
    {
        SortCompetition team1= new Team5SortCompetition();
        int [] radnIntArr= randomIntsArr(10000);
        String[] randStringArr= randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time=System.currentTimeMillis();
        int median= Team5SortCompetition.challengeOne(randIntArr);
        time=System.currentTimeMillis()-time;
        System.out.println("Challenge One Time Taken: "+ time *0.001 + " Seconds");
        System.out.println("Median equals: "+ median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
}
