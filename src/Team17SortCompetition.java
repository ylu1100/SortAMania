public class Team17SortCompetition extends SortCompetition {
    public Team17SortCompetition(int[] arr)
    {

    }

    @Override
    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        toString(arr);
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
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
        return null;
    }



    /**
     * Sorts an array of integers using quickSort
     * @param arr array to sort
     * @param left left element position
     * @param right right element position
     */
    public static void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);

            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    /**
     * Creates a partition to sort two sides separately
     * @param arr array to create a partition in
     * @param left left element position
     * @param right right element position
     * @return int representing the partition position in arr
     */
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;

        for(int j = left;j<right;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return(i+1);
    }

    /**
     * swaps two items in an integer array
     * @param arr array that we will swap items for
     * @param pos1 selected position value to swap
     * @param pos2 other selected position value to swap
     */
    public static void swap(int[] arr,int pos1,int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }




    public static int findMed(int[] arr)
    {
        int idx = arr.length/2;
        int mid = arr[idx];
        if(arr.length%2 == 1)
        {
            System.out.println(mid);
            return(mid);
        }
        else
        {
            System.out.println((mid + arr[idx-1])/2);
            return((mid + arr[idx-1])/2);
        }
    }

    //toString
    public static void toString(int[] list) {

        for (int x = 0; x < list.length; x++) {
            System.out.println(list[x]);
        }

    }

    public static void generateIntList(int[] arr, int numCount)
    {
        for (int x = 0; x < numCount; x++)
        {
            arr[x] = (int) (Math.random() * numCount);
        }
    }
}
