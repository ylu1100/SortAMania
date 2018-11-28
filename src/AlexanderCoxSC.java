//Alexander Cox
//Wednesday, November 28, 2018

public class AlexanderCoxSC extends SortCompetition {

    public int challengeOne(int[] arr)
    {
        int pivot = partition(arr, (0), (arr.length - 1));

        quickSort(arr, (0), (pivot - 1));
        quickSort(arr, (pivot + 1), (arr.length - 1));

        if(arr.length % 2 == 0)
        {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }
        else
        {
            return arr[arr.length / 2];
        }
    }
    public static void quickSort (int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, (pivot - 1));
            quickSort(arr, (pivot + 1), right);
        }
    }
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, (i + 1), right);

        return i + 1;
    }


    public int challengeTwo(String[] arr, String query)
    {
        return 0;
    }



    public int challengeThree(int[] arr)
    {
        return 0;
    }



    public int challengeFour(int[][] arr)
    {
        return 0;
    }



    public int challengeFive(Comparable[] arr, Comparable query)
    {
        return 0;
    }



    public String greeting()
    {
        return "Team 16";
    }



    private static void swap (int[] arr, int pos1, int pos2)
    {
        int pHolder = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = pHolder;
    }
}
