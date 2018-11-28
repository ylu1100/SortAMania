public class Team6SortCompetition extends SortCompetition{

    public int challengeOne(int[] arr) {
        //return median;
    }

    public int challengeTwo(String[] arr, String query) {
        //return index of the first instance of that string, or -1 if not found;
    }

    public int challengeThree(int[] arr) {
        //return median;
    }

    public int challengeFour(int[][] arr) {
        //return median of the median array;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        //return position of the object, or -1 if not found;
    }

    public String greeting() {
        //return any;
    }

    public void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public int partition(int[] arr, int left, int right)
    {
        int temp;
        int pivot = arr[right];
        int i = left-1;
        for(int j = left; j<right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }
}
