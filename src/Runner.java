public class Runner {
    public static void main(String[] args) {
        SortCompetition team3 = new Team3SortCompetition();
        int[] randIntarr = randomIntsArr(100);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printarr(randIntarr);

        long time = System.currentTimeMillis();
        int median = team3.challengeOne(randIntarr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printarr(randIntarr);

    }

    public static String[] randomStringArr(int arrLength, int wordLength){
        String [] randStringArray = new String[arrLength];
        String chars = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String temp = "";
        for(int i = 0;i<arrLength;i++){
            for(int j = 0;j<wordLength;j++){
                temp = "";
                temp += chars.charAt((int)(Math.random() * (chars.length())));
            }
            randStringArray[i] = temp;
        }
        return randStringArray;
    }

    public static int[] randomIntsArr(int length){
        int[] randIntArr = new int[length];
        for(int i = 0;i<length;i++){
            randIntArr[i] = (int)(Math.random() * length)+1;
        }
        return randIntArr;
    }

    public static void printarr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }

    public static void printarr(String[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }

}