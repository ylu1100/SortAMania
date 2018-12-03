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
        int[] almostSortedArr = mostlySortedIntArr(100000);
        int[][] randomMultiArr = multiDimensionalIntArr(1000, 1000);
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

        Comparable item = randomComparableArr[2];
        start = System.currentTimeMillis();
        int objPos = team8.challengeFive(randomComparableArr, item);
        end = System.currentTimeMillis();
        time = end - start;

        System.out.println("CHALLENGE FIVE TIME: " + time * 0.001 + " Seconds");
        System.out.println("OBJECT QUERY POSITION: " + objPos);
    }

    /**
     * Generates a random Integer array from 0 - 10,000.
     * @param count Integer representing the length of the array.
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
     * @param count Integer representing the length of the array.
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
     * @param count Integer representing the length of the array.
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

    public static int[][] multiDimensionalIntArr(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            arr[i] = randomIntArray(column);
        }
        return arr;
    }

    public static Comparable[] randomComparableArr(int count) {
        Comparable[] arr = new Comparable[count];
        for (int i = 0; i < count; i++) {
            Thing thing = new Thing();
            arr[i] = thing;
        }
        return arr;
    }
}
