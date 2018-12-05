//Sullivan O'Connor
public class Team7SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        quickSort(arr, 0, arr.length-1);
        return getMedian(arr);
    }

    public int challengeTwo(String[] arr, String query)
    {
        int stringInstance = -1;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1].compareTo(arr[j]) > 0)
                {
                    swapString(arr, j, j-1);
                }
                else
                {
                    j = 0;
                }
                if(arr[j].equalsIgnoreCase(query))
                {
                    stringInstance = j;
                }
            }
        }
        return stringInstance;
    }


    public int challengeThree(int[] arr)
    {
        quickSort(arr, 0, arr.length-1);
        return getMedian(arr);
    }

    public int challengeFour(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            quickSort(arr[i], 0, arr[i].length-1);
        }
        insertionSort(arr);
        int median1 = getMedian(arr[(arr.length/2)-1]);
        int median2 = getMedian(arr[arr.length/2]);
        return (median1 + median2)/2;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        int elementInstance = -1;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1].compareTo(arr[j]) > 0)
                {
                    Comparable temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    j = 0;
                }
                if(arr[j].compareTo(query) == 0)
                {
                    elementInstance = j;
                }
            }
        }
        return elementInstance;
    }

    public String greeting()
    {
        return "Welcome to Team 7's sorter made by Sullivan O'Connor";
    }


    /**HELPER METHODS*/
    private void swap(int[] array, int pos1, int pos2)
    {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        //return array;
    }


    private void swapArray(int[][] arr, int pos1, int pos2)
    {
        int[] temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    private int getMedian(int[] arr)
    {
        int median;
        if(arr.length % 2 == 0)
        {
            median = (arr[(arr.length/2)-1] + arr[arr.length/2])/2;
        }
        else
        {
            median = arr[(arr.length/2)];
        }
        return median;
    }

    private void swapString(String[] array, int pos1, int pos2)
    {
        String temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        //return array;
    }

    private void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot +1, right);
        }
    }

    private int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }

    private void insertionSort(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(getMedian(arr[j-1]) > getMedian(arr[j]))
                {
                    swapArray(arr, j, j-1);
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
}
