import java.util.Arrays;

public class Team19SortCompetition extends SortCompetition{
    public int challengeOne(int[] arr){
        mergeSort(arr);
        return (arr[4999] + arr[5000]) / 2;
    }

    public int challengeTwo(String[] arr, String query){
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(query)){
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr){
        insertionSort(arr);
        return (arr[49999] + arr[50000]) / 2;
    }

    public int challengeFour(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            mergeSort(arr[i]);
        }
        System.out.println(Arrays.toString(arr[0]));
        int[] medianArr = medianString(arr);
        mergeSort(medianArr);

        return (medianArr[499] + medianArr[500]) / 2;
    }

    public int challengeFive(Things[] arr, Things query){
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i].compareTo(query) == 0){
                return i;
            }
        }
        return -1;
    }

    public String greeting(){
        return "Wassup yo? It is I, DIO.";
    }
    //===========================================================================================
    private static void mergeSort(int[] elements){
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp){
        if(from < to){
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elts, int from, int middle, int to, int[] temp){
        int i = from;
        int j = middle + 1;
        int k = from;
        while(i <= middle && j <= to){
            if(elts[i] < elts[j]) {
                temp[k] = elts[i];
                i++;
            } else {
                temp[k] = elts[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            temp[k] = elts[i];
            i++;
            k++;
        }
        while(j <= to){
            temp[k] = elts[j];
            j++;
            k++;
        }
        for(int x = from; x <= to; x++){
            elts[x] = temp[x];
        }
        //System.out.println(Arrays.toString(elts));
    }
    //---------------------------------------------------
    private static void bubbleSort(String[] list1){
        int swaps = 1;
        int x = 0;
        while(swaps != 0){
            swaps = 0;
            for(int i = 0; i < list1.length-1; i++){
                if(list1[i].compareTo(list1[i+1]) > 0){
                    swap(list1,i,i+1);
                    swaps++;
                }
            }
        }
    }

    private static void swap(String[] arr, int val1, int val2){
        String x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }
    //---------------------------------------------------
    private static void insertionSort(int[] list1){
        boolean done = false;
        for(int i = 1; i < list1.length; i++){ // For every value in the array
            for(int j = i; j > 0; j--){
                if (list1[j] < list1[j - 1]) {
                    swap(list1, j, j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int val1, int val2){
        int x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }
    //---------------------------------------------------
    private static int[] medianString(int[][] arr){
        int[] output = new int[1000];
        for(int i = 0; i < arr.length; i++){
            output[i] = (arr[i][499] + arr[i][500]) / 2;
        }
        return output;
    }
    //---------------------------------------------------
    private static void bubbleSort(Comparable[] list1){
        int swaps = 1;
        int x = 0;
        while(swaps != 0){
            swaps = 0;
            for(int i = 0; i < list1.length-1; i++){
                if(list1[i].compareTo(list1[i+1]) > 0){
                    swap(list1,i,i+1);
                    swaps++;
                }
            }
        }
    }
    private static void swap(Comparable[] arr, int val1, int val2){
        Comparable x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }

}
