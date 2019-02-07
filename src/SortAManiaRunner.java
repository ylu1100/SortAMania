public class SortAManiaRunner {

    public static void main(String[] args) {
        SortCompetition team5=new Team5SortCompetition();
        int[]randomIntArr= Team5SortCompetition.randomIntsArr(10000);
        String[]randStringArr=Team5SortCompetition.randomStrArr(10000,5);
        int[]randomIntArr2= Team5SortCompetition.randomIntsArr(100000);
        int[][]randomIntArr3=Team5SortCompetition.randomIntsArr(1000,1000);
        System.out.println("Unsorted");
        printArr(randomIntArr);
        long time = System.currentTimeMillis();
        int median=team5.challengeOne(randomIntArr);
        time = System.currentTimeMillis()-time;
        System.out.println("Challenge 1 Time Taken: "+ time*.001+" Seconds");
        System.out.println("Median Equals: "+median);
        System.out.println("Sorted");
        printArr(randomIntArr);
        System.out.println();
        System.out.println("Unsorted");
        printArr(randStringArr);
        long time1 = System.currentTimeMillis();
        int median1=team5.challengeTwo(randStringArr,"aaadh");
        time1 = System.currentTimeMillis()-time1;
        System.out.println("Challenge 2 Time Taken: "+ time1*.001+" Seconds");
        System.out.println("Index of your phrase Equals: "+median1);
        System.out.println("Sorted");
        printArr(randStringArr);
        System.out.println();
        System.out.println("Unsorted");
        printArr(randomIntArr2);
        long time2 = System.currentTimeMillis();
        int median2=team5.challengeThree(randomIntArr2);
        time2 = System.currentTimeMillis()-time2;
        System.out.println("Challenge 3 Time Taken: "+ time2*.001+" Seconds");
        System.out.println("Median Equals: "+median2);
        System.out.println("Sorted");
        printArr(randomIntArr2);
        System.out.println();
        System.out.println("Unsorted");
        printArr(randomIntArr3);
        long time3 = System.currentTimeMillis();
        int median3=team5.challengeFour(randomIntArr3);
        time3 = System.currentTimeMillis()-time3;
        System.out.println("Challenge 3 Time Taken: "+ time3*.001+" Seconds");
        System.out.println("Median Equals: "+median3);
        System.out.println("Sorted");
        printArr(randomIntArr3);
        System.out.println();
        // write your code here
    }
    public static void printArr(int[]arr){
        for (int i:arr)
            System.out.print(i+" ");
    }
    public static void printArr(String[]arr){
        for (String i:arr)
            System.out.print(i+" ");
    }
    public static void printArr(int[][]arr){
        for(int x = 0; x < arr.length;x++){
            for(int y = 0; y <arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}
