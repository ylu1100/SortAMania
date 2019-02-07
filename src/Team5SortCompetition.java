import java.util.Arrays;



public class Team5SortCompetition extends SortCompetition{
    @Override
    public int challengeOne(int[] arr) {
        insertionSort(arr);
        if(arr.length%2==1){
            return arr[(arr.length/2)+1];
        }
        else
        {
            return (arr[(arr.length/2)]+arr[(arr.length/2)+1])/2;
        }
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        insertionSort(arr);
        if(Arrays.binarySearch(arr,query)<0){
            return -1;
        }
        else {
            return Arrays.binarySearch(arr,query);
        }
    }

    @Override
    public int challengeThree(int[] arr) {
        int[]newarray=new int [arr.length/2];
        int[]newarray2=new int[arr.length-newarray.length];
        for(int i = 0;i<arr.length/2;i++){
            newarray[i]=arr[i];
        }
        for(int x = 0;x<newarray2.length;x++){
            newarray2[x]=arr[newarray.length+x];
        }
        insertionSort(newarray);
        insertionSort(newarray2);
        simpleMerge(arr,newarray,newarray2);
        if(arr.length%2==1){
            return arr[(arr.length/2)+1];
        }
        else
        {
            return (arr[(arr.length/2)]+arr[(arr.length/2)+1])/2;
        }
    }

    @Override
    public int challengeFour(int[][] arr) {
        int SorteArray[]=new int[1000];
        int RefArray[][]=new int[1000][2];
        for(int z=0;z <=1000; z++)
        {
            for(int i=0; i<=1000; i++)
            {

                SorteArray[i]=arr[z][i];
            }
            selectionSort(SorteArray);
            for(int i=0; i<=1000; i++)
            {

                arr[z][i]=SorteArray[i];
            }

        }

        for(int z=0; z<=1000; z++)
        {

            for(int i=0; i<1; i++)
            {
                RefArray[z][i] =z;
                RefArray[z][i+1]=arr[z][500];
            }

        }
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "Hello it's the accepted into college gang";
    }
    public static int[] randomIntsArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }
    public static int[][] randomIntsArr(int count,int count1) {
        int[][] arr = new int[count][count1];
        for(int x = 0; x < count;x++) {
            for (int i = 0; i < count; i++) {
                arr[x][i] = (int) (Math.random() * 10000);
            }
        }
        return arr;
    }
    public static String[] randomStrArr(int count, int length) {
        String[] arr = new String[count];
        while (count > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            count--;
            arr[count] = s;
        }
        return arr;
    }

    public static void swap(int[] testArr, int x, int y) {
        int temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }
    public static void swap(String[] testArr, int x, int y) {
        String temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }



    public static int minIndex(int arr[], int ind) {
        int index = ind;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void selectionSort(int[] list1) {
        for (int i = 0; i < list1.length; i++) {
            swap(list1, i, minIndex(list1, i));
        }
    }
    public static void insertionSort(int[]list1){
        for(int i = 1;i<list1.length;i++){
            for(int j = i;j>0;j--){
                if(list1[j-1]>list1[j]){
                    swap(list1,j-1,j);
                }
                else{
                    j=0;
                }
            }
        }
    }
    public static void insertionSort(String[]list1){
        for(int i = 1;i<list1.length;i++){
            for(int j = i;j>0;j--){
                if(list1[j-1].compareTo(list1[j]) >0){
                    swap(list1,j-1,j);
                }
                else{
                    j=0;
                }
            }
        }
    }

    public static void simpleMerge(int[]arr,int[] arr1, int[] arr2) {
        int[] combarray = new int[arr1.length + arr2.length];
        int ind = 0;
        int ind1=0;
        int ind2=0;
        while (ind < combarray.length) {
            if (ind1 == arr1.length || ind2 == arr2.length) {
                if (ind1 == arr1.length) {
                    combarray[ind++] = arr2[ind2++];

                }
                else {
                    combarray[ind++] = arr1[ind1++];
                }
            }
            else {
                if (arr1[ind1] < arr2[ind2]) {
                    combarray[ind++] = arr1[ind1++];
                }
                else {
                    combarray[ind++] = arr2[ind2++];
                }
            }
        }
        for(int x = 0;x<combarray.length;x++){
            arr[x]=combarray[x];
        }
    }

    public class MyMergeSort {

        private int[] arr;
        private int[] temp;
        private int length;


        public void sort(int inputArr[]) {
            this.arr = inputArr;
            this.length = inputArr.length;
            this.temp = new int[length];
            doMergeSort(0, length - 1);
        }

        private void doMergeSort(int lowerIndex, int higherIndex) {

            if (lowerIndex < higherIndex) {
                int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
                // Below step sorts the left side of the array
                doMergeSort(lowerIndex, middle);
                // Below step sorts the right side of the array
                doMergeSort(middle + 1, higherIndex);
                // Now merge both sides
                mergeParts(lowerIndex, middle, higherIndex);
            }
        }

        private void mergeParts(int lowerIndex, int middle, int higherIndex) {

            for (int i = lowerIndex; i <= higherIndex; i++) {
                temp[i] = arr[i];
            }
            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex) {
                if (temp[i] <= temp[j]) {
                    arr[k] = temp[i];
                    i++;
                } else {
                    arr[k] = temp[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                arr[k] = temp[i];
                k++;
                i++;
            }

        }
    }
}
