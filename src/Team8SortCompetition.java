public class Team8SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        int i = ((arr.length + 1)/2) - 1;
        if (arr.length % 2 == 0) {
            return (arr[i] + arr[i + 1]) / 2;
        } else {
            return arr[i];
        }
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
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
    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    /**
     * Recursive Method that breaks down the Array around a "pivot" position.
     * @param arr SAME 1D Integer Array used in quickSort().
     * @param left Integer representing the starting position of the partition.
     * @param right Integer representing the ending position of the partition.
     * @return Integer representing the new "pivot" position.
     */
    private static int partition(int[] arr, int left, int right) {
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
}
