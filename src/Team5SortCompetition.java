import java.util.Arrays;



public class Team5SortCompetition extends SortCompetition{
    @Override
    public int challengeOne(int[] arr) {
        int[]newarray=new int [arr.length];
        for(int i = 0;i<arr.length;i++){
            newarray[i]=arr[i];
        }
        SortingUtils.insertionSort(newarray);
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
        String[]newarray = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            newarray[i]=arr[i];
        }
        SortingUtils.insertionSort(newarray);
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
        int[]combnewarray=new int[arr.length];
        for(int i = 0;i<arr.length/2;i++){
            newarray[i]=arr[i];
        }
        for(int x = 0;x<newarray2.length/2;x++){
            newarray2[x]=arr[x];
        }
        SortingUtils.insertionSort(newarray);
        SortingUtils.insertionSort(newarray2);
        for()
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
        return null;
    }
        public static int[] randomIntsArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 100);
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
                if(list1[j-1].compareTo(list1[j]) >1){
                    swap(list1,j-1,j);
                }
                else{
                    j=0;
                }
            }
        }
    }

}
