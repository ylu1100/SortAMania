//Alexander Cox
//Wednesday, November 28, 2018

public class Team16SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr)
    {
        quickInt(arr, (0), (arr.length - 1));

        return getMedian(arr);
    }
    private int getMedian(int[] arr)
    {
        if(arr.length % 2 == 0)
        {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }
        else
        {
            return arr[arr.length / 2];
        }
    }
    private static void quickInt (int[] list, int left, int right)
    {
        if (left < right)
        {
            int pivot = partitionInt(list, left, right);

            quickInt(list, left, (pivot - 1));
            quickInt(list, (pivot + 1), right);
        }
    }
    private static int partitionInt(int[] list, int left, int right)
    {
        int pivot = list[(int)(Math.random() * (right - left - 1) + left)];
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

        int index = binarySearch(arr, (0), arr.length - 1, query);

        if (index < 0)
            return -1;
        if (index == 0)
            return 0;

        while(arr[index].equals(arr[index - 1]))
        {
            index--;
            if (index == 0)
                return 0;
        }

        return index;
    }
    private int binarySearch(String arr[], int min, int max, String query)
    {
        if (max >= min)
        {
            int mid = min + (max - min) / 2;

            if (arr[mid].equals(query))
                return mid;

            if (arr[mid].compareTo(query) > 0)
                return binarySearch(arr, min, (mid - 1), query);

            return binarySearch(arr, (mid + 1), max, query);
        }

        return -1;
    }
    private static void mergeString (String[] list)
    {
        int n = list.length;
        String[] temp = new String[n];
        mergeStringHelper(list, (0), (n - 1), temp);
    }
    private static void mergeStringHelper (String[] list, int left, int right, String[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeStringHelper(list, left, mid, temp);
            mergeStringHelper(list, (mid + 1), right, temp);
            mergeArrString(list, left, mid, right, temp);
        }
    }
    private static void mergeArrString (String[] list, int left, int mid, int right, String[] temp)
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
        for (int i = 1; i < arr.length; i++)
        {
            int swap = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > swap)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = swap;
        }

        return getMedian(arr);
    }



    public int challengeFour(int[][] arr)
    {
        int[] medians = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            quickInt(arr[i], (0), (arr[i].length - 1));

            medians[i] = getMedian(arr[i]);
        }

        quickInt(medians, (0), (medians.length - 1));

        return getMedian(medians);
    }



    public int challengeFive(Comparable[] arr, Comparable query)
    {
        mergeObj(arr);

        int index = binarySearchObj(arr, (0), arr.length - 1, query);

        if (index < 0)
            return -1;
        if (index == 0)
            return 0;

        while(arr[index].equals(arr[index - 1]))
        {
            index--;
            if (index == 0)
                return 0;
        }

        return index;
    }
    private int binarySearchObj(Comparable arr[], int min, int max, Comparable query)
    {
        if (max >= min)
        {
            int mid = min + (max - min) / 2;

            if (arr[mid].compareTo(query) == 0)
                return mid;

            if (arr[mid].compareTo(query) > 0)
                return binarySearchObj(arr, min, (mid - 1), query);

            return binarySearchObj(arr, (mid + 1), max, query);
        }

        return -1;
    }
    private static void mergeObj (Comparable[] list)
    {
        int n = list.length;
        Comparable[] temp = new Comparable[n];
        mergeObjHelper(list, (0), (n - 1), temp);
    }
    private static void mergeObjHelper (Comparable[] list, int left, int right, Comparable[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeObjHelper(list, left, mid, temp);
            mergeObjHelper(list, (mid + 1), right, temp);
            mergeArrObj(list, left, mid, right, temp);
        }
    }
    private static void mergeArrObj (Comparable[] list, int left, int mid, int right, Comparable[] temp)
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
