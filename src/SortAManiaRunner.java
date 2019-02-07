
public class SortAManiaRunner {

    public static void main(String[] args) {
        SortCompetition team5=new Team5SortCompetition();
        int[]randomIntArr= Team5SortCompetition.randomIntsArr(10000);
        String[]randStringArr=Team5SortCompetition.randomStrArr(10000,5);
        System.out.println("Unsorted");
        printArr(randomIntArr);
        long time = System.currentTimeMillis();
        int median=team5.challengeOne(randomIntArr);
        time = System.currentTimeMillis()-time;
        System.out.println("Challenge One Time Taken: "+ time*.001+" Seconds");
        System.out.println("Median Equals: "+median);
        System.out.println("Sorted");
        printArr(randomIntArr);
        // write your code here
    }
}
