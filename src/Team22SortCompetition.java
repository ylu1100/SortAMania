//Dylan Yang Team22

public class Team22SortCompetition extends SortCompetition {

    public static void main(String[] args) {
//
//        SortCompetition team22 = new Team22SortCompetition();
//        int[] randIntArr = generateIntArr(10000, 10000);
//        String[] randStringArr = randomStringArr(10000, 5);
//
//        System.out.println("Unsorted");
//        System.out.println(java.util.Arrays.toString(randIntArr));
//        long time = System.currentTimeMillis();
//        int median = team22.challengeOne(randIntArr);
//        time = System.currentTimeMillis() - time;
//        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds.");
//        System.out.println("Median equals: " + median);
//        System.out.println("Sorted");
//        System.out.println(java.util.Arrays.toString(randIntArr));
//
//        System.out.println("Unsorted");
//        System.out.println(java.util.Arrays.toString(randStringArr));
//        time = System.currentTimeMillis();
//        median = team22.challengeTwo(randStringArr, "acsad");
//        time = System.currentTimeMillis() - time;
//        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds.");
//        System.out.println("Sorted");
//        System.out.println(java.util.Arrays.toString(randStringArr));
//
//        int[][] arr4 = new int[1000][1000];
//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0; j < arr4[i].length; j++) {
//                arr4[i][j] = (int) (Math.random() * 10000);
//            }
//        }
//        System.out.println("Unsorted");
//        System.out.println(java.util.Arrays.toString(arr4));
//        time = System.currentTimeMillis();
//        median = team22.challengeFour(arr4);
//        time = System.currentTimeMillis() - time;
//        System.out.println("Challenge Four Time Taken: " + time * 0.001 + " Seconds.");
//        System.out.println("Median equals: " + median);
//        System.out.println("Sorted");
//        System.out.println(java.util.Arrays.toString(arr4));
//
//        int[] challengeOne = generateIntArr(10000, 10000);
//        long start = System.nanoTime();
//        countingSort(challengeOne);
//        long end = System.nanoTime();
//        long time = end - start;
//        System.out.println("ChallengeOne took " + (time / 1000) + " Microseconds");
//        System.out.println("Sorted Int Array " + java.util.Arrays.toString(challengeOne));
//        System.out.println("Median of ChallengeOne: " + getSortedMedian(challengeOne));
//
//        String[] challengeTwo = randomStringArr(10000, 5);
//        start = System.nanoTime();
//        bubbleSort(challengeTwo);
//        end = System.nanoTime();
//        time = end - start;
//        System.out.println(time);
//        System.out.println(java.util.Arrays.toString(challengeTwo));
    }


    public static int getSortedMedian(int[] array) {
        int length = array.length;
        if (length % 2 == 0) {
            int medPos = length / 2;
            int medPos2 = length / 2 - 1;
            return (array[medPos] + array[medPos2]) / 2;
        } else {
            int medPos = length / 2;
            return array[medPos];
        }
    }

    public static void swapDouble(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapInt(int[] arr, int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    /**
     * This is the same method as above but swapCount 2 String
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swapArr(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public String greeting() {
        return "Ayo whats jiggy";
    }

    public int challengeOne(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        int[] newsortedNumbers = new int[max + 1];
        for (int i = 0; i < numbers.length; i++) {
            newsortedNumbers[numbers[i]]++;
        }
        int insertPosition = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < newsortedNumbers[i]; j++) {
                numbers[insertPosition] = i;
                insertPosition++;
            }
        }
        int length = numbers.length;
        if (length % 2 == 0) {
            int medPos = length / 2;
            int medPos2 = length / 2 - 1;
            return (numbers[medPos] + numbers[medPos2]) / 2;
        } else {
            int medPos = length / 2;
            return numbers[medPos];
        }
    }

    public int challengeTwo(String[] arr, String query) {
        int swapCount = 1;
        while (swapCount != 0) {
            swapCount = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swapArr(arr, i, i + 1);
                    swapCount++;
                }
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].equals(query)) {
                    return j;
                }
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        int median = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapInt(arr, j, j - 1);
                }
            }
        }
        median = getSortedMedian(arr);
        return median;
    }

    public int challengeFour(int[][] arr) {
        int[] arr2 = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            arr2[j] = challengeThree(arr[j]);
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr2[j] < arr2[j - 1]) {
                    swapInt(arr2, j, j - 1);
                }
            }
        }
        return getSortedMedian(arr2);
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == query) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Bubble sort compares 2 items and if the compareTo method compares the first letter and if its out of order they swap.
     *
     * @param arr
     */
    public static void bubbleSort(Comparable[] arr) {
        int swapCount = 1;
        while (swapCount != 0) {
            swapCount = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapCount++;
                }
            }
        }
    }
}
