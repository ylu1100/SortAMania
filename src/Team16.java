//Alexander Cox
//Wednesday, November 28, 2018

public class Team16 extends SortCompetition {

    public int challengeOne(int[] arr)
    {
        quickInt(arr, (0), (arr.length - 1));

        if(arr.length % 2 == 0)
        {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }
        else
        {
            return arr[arr.length / 2];
        }
    }
    public static void quickInt (int[] list, int left, int right)
    {
        if (left < right)
        {
            int pivot = partitionInt(list, left, right);

            quickInt(list, left, (pivot - 1));
            quickInt(list, (pivot + 1), right);
        }
    }
    public static int partitionInt(int[] list, int left, int right)
    {
        int pivot = list[right];
        int i = left - 1;

        for (int j = left; j < right; j++)
        {
            if (list[j] <= pivot)
            {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, (i + 1), right);

        return i + 1;
    }


    public int challengeTwo(String[] arr, String query)
    {
        mergeString(arr);

        return binarySearch(arr, (0), arr.length - 1, query);
    }
    int binarySearch(String arr[], int min, int max, String query)
    {
        if (max >= min)
        {
            int mid = min + (max - min) / 2;

            if (arr[mid].equals(query))
                return mid;

            if (arr[mid].compareTo(query) < 0)
                return binarySearch(arr, min, (mid - 1), query);

            return binarySearch(arr, (mid + 1), max, query);
        }

        return -1;
    }
    public static void mergeString (String[] list)
    {
        int n = list.length;
        String[] temp = new String[n];
        mergeStringHelper(list, (0), (n - 1), temp);
    }
    public static void mergeStringHelper (String[] list, int left, int right, String[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeStringHelper(list, left, mid, temp);
            mergeStringHelper(list, (mid + 1), right, temp);
            mergeArrString(list, left, mid, right, temp);
        }
    }
    public static void mergeArrString (String[] list, int left, int mid, int right, String[] temp)
    {
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right)
        {
            if (list[i].compareTo(list[j]) < 0)
            {
                temp[k] = list[i];
                i++;
            }
            else
            {
                temp[k] = list[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = list[i];
            i++;
            k++;
        }

        while (j <= right)
        {
            temp[k] = list[j];
            j++;
            k++;
        }

        for (int x = left; x <= right; x++)
        {
            list[x] = temp[x];
        }
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
