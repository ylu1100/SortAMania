// Afaq Anwar

public class Team8SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        quickSortInt(arr, 0, arr.length - 1);
        return median(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        lsdRadixSortStr(arr, 5);
        return binarySearchStr(arr, query);
    }

    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return median(arr);
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "Jarvis here, ready when you are...";
    }

    /**
     * Initiates the recursive quick-sort algorithm.
     * @param arr Any 1D Integer Array.
     * @param left Integer representing the starting position of the Array / sector to be sorted. (Begins the sort here - [Usually 0])
     * @param right Integer representing the ending position of the Array / sector to be sorted. (Usually Array.length - 1)
     */
    private static void quickSortInt(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partitionInt(arr, left, right);
            quickSortInt(arr, left, pivot - 1);
            quickSortInt(arr, pivot + 1, right);
        }
    }
    /**
     * Recursive Method that breaks down the Array around a "pivot" position.
     * @param arr SAME 1D Integer Array used in quickSort().
     * @param left Integer representing the starting position of the partition.
     * @param right Integer representing the ending position of the partition.
     * @return Integer representing the new "pivot" position.
     */
    private static int partitionInt(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[right];
        arr[right] = arr[i + 1];
        arr[i + 1] = temp;
        return i+ 1;
    }

    /**
     * LSD String Sort. Hybrid between a Radix / Count Sort.
     * Works with a String Array with Strings of an exact length.
     * @param arr Any 1D String Array.
     * @param strLength Integer representing the length of each String in the String Array (arr).
     */
    private static void lsdRadixSortStr(String[] arr, int strLength) {
        int arrLength = arr.length;
        // Maximum ASCII Character.
        int maxChar = 256;
        // Temporary Array to store Char frequencies.
        String[] temp = new String[arrLength];
        // Loops through each String backwards.
        for (int i = strLength-1; i >= 0; i--) {
            // Sets up an Array that will store the frequencies of words.
            int[] count = new int[maxChar + 1];
            // Calculates frequencies.
            for (int j = 0; j < arrLength; j++) {
                count[arr[j].charAt(i) + 1]++;
            }
            // Add up frequencies.
            for (int k = 0; k < maxChar; k++) {
                count[k + 1] += count[k];
            }
            // Move into place in temp Array.
            for (int j = 0; j < arrLength; j++) {
                temp[count[arr[j].charAt(i)]++] = arr[j];
            }
            // Original Array is now modified to reflect temp Array.
            for (int j = 0; j < arrLength; j++) {
                arr[j] = temp[j];
            }
        }
    }

    /**
     * Optimized Insertion Sort.
     * @param arr Any 1D Integer Array.
     */
    private static void insertionSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currHold = arr[i];
            int currPos = i;
            while (currPos > 0 && arr[currPos -1] > currHold) {
                arr[currPos] = arr[currPos - 1];
                currPos--;
            }
            arr[currPos] = currHold;
        }
    }

    /**
     * Calculates the median.
     * @param arr Any 1D Integer Array.
     * @return Integer representing the median. (Rounded Down)
     */
    private static int median(int[] arr){
        int i = ((arr.length + 1)/2) - 1;
        if (arr.length % 2 == 0) {
            return (arr[i] + arr[i + 1]) / 2;
        } else {
            return arr[i];
        }
    }

    /**
     * Binary Search for a String in an Array of Strings.
     * @param arr Any 1D String Array.
     * @param key String to be searched for.
     * @return Integer representing the position of the String in the Array. (-1 if not found)
     */
    public static int binarySearchStr(String[] arr, String key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (key.compareTo(arr[middle]) < 0) {
                right = middle - 1;
            } else if (key.compareTo(arr[middle]) > 0) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
