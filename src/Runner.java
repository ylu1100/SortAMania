public class Runner {

    public static void main(String[] args) {
        SortCompetition team4 = new Team4SortCompetition();

        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team4.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken"+ time*0.001+" Seconds");
        System.out.println("Median equals: "+ median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
    public static int[] randomIntsArr(int lim){
        int[] arr = new int[lim];
        for(int i = 0; i < arr.length;i++ )
        {
            arr[i] = (int)((Math.random())*10000);
        }
        return arr;
    }
    public static String[] randomStringArr(int lim, int length){
        String[] arr = new String[lim];
        return arr;
    }
    public static void printArr(int[] arr){
        String var = "";
        for(int i =0; i <arr.length;i++){
            var += arr[i]+", ";
        }
        System.out.println(var);
    }
}
