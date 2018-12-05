// Afaq Anwar

/**
 * Tests for Methods Go Here.
 * REMOVE BEFORE SUBMISSION!
 */
public class Runner {
    public static void main(String[] args) {
        Team8SortCompetition team8 = new Team8SortCompetition();
        int[] randomIntArr = randomIntArray(10000);
        String[] randomStrArr = randomStringArray(10000, 5);
        randomStrArr[0] = "hello";
        int[] almostSortedArr = mostlySortedIntArr(100000);
        int[][] randomMultiArr = randomMultiDimensionalIntArr(1000,1000);
        Comparable[] randomComparableArr = randomComparableArr(10000);

        long start = System.currentTimeMillis();
        int median = team8.challengeOne(randomIntArr);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("CHALLENGE ONE TIME: " + time * 0.001 + " Seconds");
        System.out.println("MEDIAN: " + median + "\n");

        start = System.currentTimeMillis();
        int strPos = team8.challengeTwo(randomStrArr, "hello");
        end = System.currentTimeMillis();
        time = end - start;

        System.out.println("CHALLENGE TWO TIME: " + time * 0.001 + " Seconds");
        System.out.println("String Query Position: " + strPos + "\n");

        start = System.currentTimeMillis();
        median = team8.challengeThree(almostSortedArr);
        end = System.currentTimeMillis();
        time = end - start;

        System.out.println("CHALLENGE THREE TIME: " + time * 0.001 + " Seconds");
        System.out.println("MEDIAN: " + median + "\n");

        start = System.currentTimeMillis();
        median = team8.challengeFour(randomMultiArr);
        end = System.currentTimeMillis();
        time = end - start;

        System.out.println("CHALLENGE FOUR TIME: " + time * 0.001 + " Seconds");
        System.out.println("MEDIAN: " + median + "\n");

        Comparable obj = randomComparableArr[0];
        start = System.currentTimeMillis();
        int objPos = team8.challengeFive(randomComparableArr, obj);
        end = System.currentTimeMillis();
        time = end - start;

        System.out.println("CHALLENGE FIVE TIME: " + time * 0.001 + " Seconds");
        System.out.println("Object Query Position: " + objPos);
    }

    /**
     * Generates a random Integer array from 0 - 10,000.
     * @param count Integer representing the length of the Array.
     * @return 1D Integer Array.
     */
    public static int[] randomIntArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
        return arr;
    }

    /**
     * Generates a random Double array from  0 - 10,000.
     * @param count Integer representing the length of the Array.
     * @return 1D Double Array.
     */
    public static double[] randomDoubleArray(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 10000);
        }
        return arr;
    }

    /**
     * Generates a random String array with Strings of a certain length.
     * Upper & Lowercase letters.
     * @param count Integer representing the length of the Array.
     * @param strLength Integer representing the length of each String inside of the Array.
     * @return 1D String Array.
     */
    public static String[] randomStringArray(int count, int strLength) {
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            int wordLength = strLength;
            String word = "";
            for (int x = 0; x < wordLength; x++) {
                int randomChoice = (int)((Math.random() * 100) + 1);
                char ch;
                if (randomChoice > 50) {
                    ch = (char) ((int) ((Math.random() * 26) + 65));
                } else {
                    ch = (char) ((int) ((Math.random() * 26) + 97));
                }
                word+= ch;
            }
            arr[i] = word;
        }
        return arr;
    }

    /**
     * Generates a 75% sorted 1D Integer Array.
     * @param count Integer representing the length of the Array.
     * @return 1D Integer Array.
     */
    public static int[] mostlySortedIntArr(int count) {
        int[] arr = new int[count];
        int sortedUntil = (int)(arr.length * 0.75);
        for (int i = 0; i < sortedUntil; i++) {
            arr[i] = i;
        }
        for (int j = sortedUntil; j < arr.length; j++) {
            arr[j] = (int)(Math.random() * 10000);
        }
        return arr;
    }

    /**
     * Generates a random 2D Integer Array with Integers ranging from 0 - 10,000.
     * @param row Integer representing the amount of rows in 2D Array.
     * @param column Integer representing the amount of columns in the 2D Array.
     * @return 2D Integer Array.
     */
    public static int[][] randomMultiDimensionalIntArr(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            arr[i] = randomIntArray(column);
        }
        return arr;
    }

    /**
     * Generates an Array of Comparable Objects, in this case Things.
     * Note ~ Things is constructed with a Integer value (0-10,000).
     * @param count Integer representing the length of the Array.
     * @return 1D Comparable Array.
     */
    public static Comparable[] randomComparableArr(int count) {
        Comparable[] arr = new Comparable[count];
        for (int i = 0; i < count; i++) {
            arr[i] = new Thing();
        }
        return arr;
    }
}
