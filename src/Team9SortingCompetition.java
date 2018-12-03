public class Team9SortingCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        mergeSortInt(arr);
        int median = 0;
        return getMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        mergeSortStr(arr);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(query))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr) {
        selectionSort(arr);
        int median = 0;
        return getMedian(arr);
    }

    @Override
    public int challengeFour(int[][] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            mergeSortInt(arr[i]);
        }
        mergeArrSort(arr);
        return getMedian(arr[arr.length/2]);
    }

    @Override
    public int challengeFive(Thing[] arr, Thing query) {
        comparableBubbleSort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == query)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String greeting() {
        return "";
    }
    public void mergeSortInt(int[] arr) {
        int n = arr.length;
        int [] temp = new int[n];
        mergeSortHelperInt(arr,0,n - 1, temp);
    }
    public void mergeSortHelperInt(int[] arr, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelperInt(arr, left, mid, temp);
            mergeSortHelperInt(arr,mid + 1, right, temp);
            mergeInt(arr,left,mid,right,temp);
        }
    }
    public void mergeInt(int[] arr, int left, int mid, int right, int[] temp)
    {
        for(int x = 0; x < arr.length; x++)
        {
            temp[x] = arr[x];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int z = 0; z < arr.length; z++)
        {
            arr[z] = temp[z];
        }
    }
    public void mergeSortStr(String[] arr) {
        int n = arr.length;
        String [] temp = new String[n];
        mergeSortHelperStr(arr,0,n - 1, temp);
    }
    public void mergeSortHelperStr(String[] arr, int left, int right, String[] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelperStr(arr, left, mid, temp);
            mergeSortHelperStr(arr,mid + 1, right, temp);
            mergeStringStr(arr,left,mid,right,temp);
        }
    }
    public void mergeStringStr(String[] arr, int left, int mid, int right, String[] temp)
    {
        for(int x = 0; x < arr.length; x++)
        {
            temp[x] = arr[x];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right)
        {
            int length = 0;
            if(arr[i].length() > arr[j].length())
            {
                length = arr[j].length();
            }
            else
            {
                length = arr[i].length();
            }
            if(arr[i].compareTo(arr[j]) < 0)
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int z = 0; z < arr.length; z++)
        {
            arr[z] = temp[z];
        }
    }
    public void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int b = i;
            for(int a = i; a < arr.length; a++)
            {
                if(arr[b] > arr[a])
                {
                    b = a;
                }
            }
            for(int c = b; c > i; c--) {
                int temp = arr[c];
                arr[c] = arr[c - 1];
                arr[c - 1] = temp;
            }
        }
    }
    public int getMedian(int[] arr)
    {
        int median = 0;
        if(arr.length%2 == 0)
        {
            median = arr[arr.length/2];
        }
        else
        {
            median = (arr[(int)Math.floor(arr.length/2)] + arr[(int)Math.floor(arr.length/2)])/2;
        }
        return median;
    }
    public void mergeArrSort(int[][] arr)
    {
        int n = arr.length;
        int[][] temp = new int[n][1000];
        mergeSortHelperArr(arr,0,n - 1, temp);
    }
    public void mergeSortHelperArr(int[][] arr, int left, int right, int[][] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelperArr(arr, left, mid, temp);
            mergeSortHelperArr(arr,mid + 1, right, temp);
            mergeArr(arr,left,mid,right,temp);
        }
    }
    public void mergeArr(int[][] arr, int left, int mid, int right, int[][] temp)
    {
        for(int x = 0; x < arr.length; x++)
        {
            temp[x] = arr[x];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right)
        {
            if(getMedian(arr[i]) < getMedian(arr[j]))
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int z = 0; z < arr.length; z++)
        {
            arr[z] = temp[z];
        }
    }
    public void comparableBubbleSort(Thing[] arr)
    {
        int swaps = 0;
        boolean swapped = true;
        while(swapped)
        {
            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    Thing temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }
            }
            if(swaps > 0)
            {
                swaps = 0;
            }
            else
            {
                if(swaps == 0)
                {
                    swapped = false;
                }
            }
        }
    }
}
