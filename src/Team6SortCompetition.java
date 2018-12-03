public class Team6SortCompetition extends SortCompetition{

    public int challengeOne(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        int[] sortedArr = quickSort(arr,0,arr.length-1);
        return median(i,j,sortedArr,0);
    }

    public int challengeTwo(String[] arr, String query)
    {
        String[] sortedArr = quickSort(arr,0,arr.length-1);
        for (int i = 0; i < sortedArr.length; i++)
        {
            if(query.equals(sortedArr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        int[] sortedArr = insertionSort(arr);
        return median(i,j,sortedArr,0);
    }

    public int challengeFour(int[][] arr)
    {
        int[] arr2 = new int[arr.length];
        int x = 0;
        int y = arr2.length-1;
        int median = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int[] subarr = new int[arr[i].length];
            for(int j = 0; j<arr[i].length; j++)
            {
                subarr[j] = arr[i][j];
            }
            int[] sortedArr = quickSort(subarr,0,subarr.length-1);
            for(int j = 0; j<arr[i].length; j++)
            {
                arr[i][j] = subarr[j];
            }
            int x2 = 0;
            int y2 = subarr.length-1;
            int median2 = 0;
            while(x2 != y2)
            {
                x2++;
                y2--;
                if((x2+1) == y2 || (y2-1) == x2)
                {
                    int total = sortedArr[x2] + sortedArr[y2];
                    median2 = (total/2);
                    break;
                }
                else
                {
                    median2 = sortedArr[x2];
                }
            }
            arr2[i] = median2;
        }

        int[] sortedArr2 = quickSort(arr2,0,arr2.length-1);

        int min;
        for(int i = 1; i < arr2.length; i++)
        {
            min = arr2[i];
            int temp = min;
            for(int z = i-1; z>=0; z--)
            {
                if(arr2[z]>temp)
                {
                    arr2[z+1] = arr2[z];
                    arr2[z] = temp;

                    int[] temparr = new int[arr[z].length];
                    for(int t = 0; t < arr[z].length; t++)
                    {
                        temparr[t] = arr[z][t];
                    }
                    for(int t = 0; t < arr[z].length; t++)
                    {
                        arr[z+1][t] = arr[z][t];
                        arr[z][t] = temparr[t];
                    }
                }
            }
        }


        while(x != y)
        {
            x++;
            y--;
            if((x+1) == y || (y-1) == x)
            {
                int total = sortedArr2[x] + sortedArr2[y];
                median = (total/2);
                break;
            }
            else
            {
                median = sortedArr2[x];
            }
        }
        return median;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        Comparable[] sortedArr = insertionSort(arr);
        for (int i = 0; i < sortedArr.length; i++)
        {
            if(query.equals(sortedArr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public String greeting()
    {
        return "Yo what's good? Back in my day I was known as the sorting champion! I'm a little old now, but I can still sort like there's no tomorrow!";
    }

    public int[] quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
        return arr;
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

    public int[] insertionSort(int[] list1)
    {
        int min;
        for(int i = 1; i < list1.length; i++)
        {
            min = list1[i];
            int temp = min;
            for(int x = i-1; x>=0; x--)
            {
                if(list1[x]>temp)
                {
                    list1[x+1] = list1[x];
                    list1[x] = temp;
                }
            }
        }
        return list1;
    }

    public String[] quickSort(String[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
        return arr;
    }

    public int partition(String[] arr, int left, int right)
    {
        String temp;
        String pivot = arr[right];
        int i = left-1;
        for(int j = left; j<right; j++)
        {
            if(arr[j].compareTo(pivot) <= 0)
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

    public Comparable[] insertionSort(Comparable[] list1)
    {
        Comparable min;
        for(int i = 1; i < list1.length; i++)
        {
            min = list1[i];
            Comparable temp = min;
            for(int x = i-1; x>=0; x--)
            {
                if(list1[x].compareTo(temp) > 0)
                {
                    list1[x+1] = list1[x];
                    list1[x] = temp;
                }
            }
        }
        return list1;
    }
    public int median(int i, int j, int[] sortedArr, int median)
    {
        while(i != j)
        {
            i++;
            j--;
            if((i+1) == j || (j-1) == i)
            {
                int total = sortedArr[i] + sortedArr[j];
                median = (total/2);
                break;
            }
            else
            {
                median = sortedArr[i];
            }
        }
        return median;
    }
}
