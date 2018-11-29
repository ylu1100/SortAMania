public class Team3SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return findMedian(arr);
    }

    public int challengeTwo(String[] arr, String query) {
        stringMergeSort(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(query))
            return i;
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return findMedian(arr);
    }

    public int challengeFour(int[][] arr) {
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    public String greeting() {
        return null;
    }

    /*
    -------------------------------HELPER-METHODS---------------------------------
     */
    public static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos2];
        arr[pos2] = arr[pos1];
        arr[pos1] = temp;
    }

    public int findMedian(int[] arr) {
        if (arr.length % 2 == 0) {
            return ((int) arr[arr.length / 2] + (int) arr[arr.length / 2 - 1]) / 2;
        } else {
            return (int) arr[arr.length / 2];
        }
    }
    /*
    ----------------------------------SORTING-METHODS--------------------------------
     */
    public void bubblesort(int []arr){
        int endOfArray = arr.length;
        int swapcount = 0;
        boolean finished = false;
        int pos1 = 0;
        while(finished && swapcount == 0){
            swapcount = 0;
            if(arr[pos1] > arr[pos1+1]){
                swap(arr,pos1,pos1+1);
                swapcount ++;
            }
            pos1++;
            if(pos1 == endOfArray - 1){
                pos1 = 0;
                finished = true;
            }
        }
    }
    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currSwap = arr[i];
            int currPos = i;
            while (currPos > 0 && arr[currPos -1] > currSwap) {
                arr[currPos] = arr[currPos - 1];
                currPos--;
            }
            arr[currPos] = currSwap;
        }
    }
    public void quickSort(int[] arr, int left, int right){
        if(left<right){
            int pivot = partition(arr,left,right);

            quickSort(arr, left,pivot-1);
            quickSort(arr,pivot+1, right);
        }
    }
    public int partition(int[] arr, int left, int right){
        int pivot = (int)(Math.random() * arr.length);
        int index = left-1;
        for(int i=left;i<right;i++) {
            if (arr[i] <= pivot) {
                index++;
                swap(arr, index, i);
            }
        }
        swap(arr,index+1,right);
        return index + 1;
    }
    public int stringMergeSort(String[] arr){
        int length = arr.length;
        String[] temp = new String[length];
        stringMergeSortHelper(arr, 0,length-1, temp);
    }
    public void stringMergeSortHelper(String[] arr, int left, int right, String[] temp){
        if(left<right){
            int middle = (left + right)/2;
            stringMergeSortHelper(arr, left, middle, temp);
            stringMergeSortHelper(arr, middle+1, right, temp);
            stringMerge(arr,left,middle,right,temp);
        }
    }
    public void stringMerge(String[] arr, int left, int middle, int right, String[] temp){
        int i = left; int j = middle + 1; int k = left;
        while(i <= middle && j <= right) {
            if(arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int l = left;l <= right;l++){
            arr[l] = temp[l];
        }

    }
}
