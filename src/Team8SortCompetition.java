// Afaq Anwar

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Team8SortCompetition extends SortCompetition {
    /**
     * Sorts a random 1D Integer Array implementing Quick Sort.
     * @param arr Any 1D Integer Array.
     * @return Median of the Integer Array. (rounded down)
     */
    @Override
    public int challengeOne(int[] arr) {
        quickSortInt(arr, 0, arr.length - 1);
        return median(arr);
    }

    /**
     * Sorts a random String Array with Strings of length 5 implementing LSD String Sort.
     * @param arr Any 1D String Array with Strings of length 5.
     * @param query String that is searched for within the String Array (arr).
     * @return Position of query within the String Array (arr).
     */
    @Override
    public int challengeTwo(String[] arr, String query) {
        lsdRadixSortStr(arr, 5);
        return binarySearch(arr, 0 , arr.length - 1, query);
    }

    /**
     * Sorts a 75% sorted 1D Integer Array implementing Insertion Sort.
     * @param arr Any 1D Integer Array that is >= 75% sorted.
     * @return Median of the Integer Array. (rounded down)
     */
    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return median(arr);
    }

    /**
     * Sorts a 2D Integer Array implementing Quick Sort.
     * @param arr Any 2D Integer Array.
     * @return Median of the Median Array.
     */
    @Override
    public int challengeFour(int[][] arr) {
        // HashMap stores the Median (Integer) & the Array.
        // {3, {1,2,3,4,5}}
        HashMap<Integer, int[]> medianMap = new HashMap<>();

        // ArrayList of Integers that will store the medians in parallel with future Sorted Tree Map.
        // Used to call the medians of each Array due to the added complexity of obtaining a key with a value from a TreeMap / or HashMap.
        ArrayList<Integer> medians = new ArrayList<>();

        // Sorts each Array inside of the 2D Array.
        for (int[] subArr : arr) {
            quickSortInt(subArr, 0, subArr.length - 1);
            // Updates the HashMap.
            medianMap.put(median(subArr), subArr);
        }

        // Generation of a TreeMap automatically sorts our HashMap using the Keys as the comparator.
        // Since every Array will be randomly generated this relies on each Array having a different Median.
        TreeMap<Integer, int[]> sortedMedianMap = new TreeMap<>(medianMap);

        // Position Storage.
        int i = 0;

        // Loops through the sorted TreeMap & copies the sorted Arrays into the 2D Array.
        for (int median : sortedMedianMap.keySet()) {
            arr[i] = sortedMedianMap.get(median);
            // Medians are stored in the ArrayList in Parallel in order to find the median of the median Array.
            medians.add(median);
            i++;
        }

        return mapMedian(medians);
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        insertionSortComparable(arr);
        return binarySearch(arr, 0, arr.length - 1, query);
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
     * Optimized Insertion Sort for Integers.
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
     * Optimized Insertion Sort for Comparable Objects.
     * @param arr Any 1D Comparable Array.
     */
    private static void insertionSortComparable (Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Comparable currHold = arr[i];
            int currPos = i;
            while (currPos > 0 && arr[currPos -1].compareTo(currHold) > 0) {
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
     * Calculates the median within an ArrayList of Integers.
     * @param medians Any 1D ArrayList of Integers.
     * @return Integer representing the median. (Rounded Down)
     */
    private static int mapMedian(ArrayList<Integer> medians) {
        int i = ((medians.size() + 1)/2) - 1;
        if (medians.size() % 2 == 0) {
            return (medians.get(i) + medians.get(i + 1)) / 2;
        } else {
            return medians.get(i);
        }
    }

    /**
     * Helper Method for Binary Search.
     * @param arr Any 1D Comparable Array.
     * @param index Integer representing the Position to compare.
     * @param obj Any Comparable Object.
     * @return If the Object at index is greater or equal than obj, return true.
     *         Else false.
     */
    private static boolean isGreaterThanEqualTo(Comparable[] arr, int index, Comparable obj) {
        if (arr[index].compareTo(obj) >=  0) {
            return true;
        }
        return false;
    }

    /**
     * Binary Search that only obtains the first instance of a Comparable object.
     * @param arr 1D Comparable Array.
     * @param left Integer representing the left bound of the Array (arr).
     * @param right Integer representing the right bound of the Array (arr).
     * @param obj Any Comparable object.
     * @return The first position of the Object (obj) inside of the Comparable Array (arr).
     */
    private static int binarySearch(Comparable[] arr, int left, int right, Comparable obj) {
        while (left < right) {
            int middle = (left + right) / 2;
            if (isGreaterThanEqualTo(arr, middle, obj)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        if (arr[left].compareTo(obj) == 0 && arr[left] == obj) {
            return left;
        } else if (arr[right].compareTo(obj) == 0 && arr[right] == obj) {
            return right;
        } else {
            return -1;
        }
    }
}
