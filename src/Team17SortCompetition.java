public class Team17SortCompetition extends SortCompetition {
    private int[] arr = new int[];
    public Team17SortCompetition(int numCount)
    {
        this.arr = randIntArr(numCount);

    }

    @Override
    public static int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        System.out.println(arr);
        return findMed(arr);
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
            return(mid);
        }
        else
        {
            return((mid + arr[idx-1])/2);
        }
    }

    //toString
    public static void toString(int[] list) {

        String out = "";

        for(int i =0;i<list.length;i++)
        {
            out += list[i];
            if(i != list.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);

    }

    /**
     * Creates array of random integers
     * @param count number of number in the array
     * @return array with random integers
     */
    public static int[] randIntArr(int count)
    {
        int[] randArr = new int[count];

        for(int i=0; i<randArr.length;i++)
        {
            randArr[i] = (int)(Math.random()*10001);
        }
        return(randArr);
    }
}
