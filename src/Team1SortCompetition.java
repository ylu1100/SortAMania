public class Team1SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        if((arr.length/2)%2==0){
            return arr[(arr.length/2)-1];
        } else {
            return (arr[(arr.length/2)-1] + arr[arr.length/2])/2;
        }
    }

    public int challengeTwo(String[] arr, String query) {
        return -1;
    }

    public int challengeThree(int[] arr) {
        return -1;
    }

    public int challengeFour(int[][] arr) {
        return -1;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return -1;
    }

    public String greeting() {
        return "Hello.";
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}