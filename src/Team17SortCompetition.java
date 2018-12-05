public class Team17SortCompetition extends SortCompetition
{
    /**
     * sorts array of integers using quickSort and then returns the median
     * @param arr array to sort
     * @return median of sorted array
     */
    @Override
    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);

        return (findMed(arr));
    }

    /**
     * sorts array of Strings using quickSort and then returns index of query in arr
     * @param arr array to sort and look for query in
     * @param query String to search for in arr
     * @return index of query in arr or -1 if not found
     */
    @Override
    public int challengeTwo(String[] arr, String query)
    {
        quickSort(arr,0,arr.length-1);
        return binarySearch(arr,query);
    }

    /**
     * sorts mostly sorted int array with insertionSort and then returns median
     * @param arr array to sort
     * @return median of sorted array
     */
    @Override
    public int challengeThree(int[] arr)
    {
       insertionSort(arr);

        return findMed(arr);
    }

    /**
     * Sorts arrays, then sorts them by median, and finally returns the median of the median array
     * @param arr 2D array to sort and find the median of
     * @return median of the median array of arr
     */
    @Override
    public int challengeFour(int[][] arr)
    {
        int[] mids = new int[arr.length];

        for(int i = 0;i<arr.length;i++)
        {
            quickSort(arr[i],0,arr.length-1);

            mids[i] = findMed(arr[i]);
        }

        quickSort(mids,arr,0,mids.length-1);
        return findMed(mids);
    }

    /**
     * sorts Comparable objects and the returns index of query in arr
     * @param arr array to sort and search for query in
     * @param query Comparable object we are looking for in arr
     * @return index of query in arr or -1 if not found
     */
    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        insertionSort(arr);

        return(binarySearch(arr,query));
    }

    /**
     * Greets user
     * @return String representing the greeting that will be given
     */
    @Override
    public String greeting()
    {
        return "Yoyoyo, this is Mir and Sheba. We are team 17. You ready to do some sorting??";
    }



    /**
     * Sorts an array of integers using quickSort
     * @param arr int array to sort
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
     * Sorts a 2D array based on median
     * @param mids int array with median value for every array in norm
     * @param norm int 2D array to be sorted
     * @param left left element position
     * @param right right element position
     */
    public static void quickSort(int[] mids, int[][] norm, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(mids,norm,left,right);

            quickSort(mids,norm,left,pivot-1);
            quickSort(mids,norm,pivot+1,right);
        }
    }

    /**
     * Sorts an array of Strings using quickSort
     * @param arr String array to sort
     * @param left left element position
     * @param right right element position
     */
    public static void quickSort(String[] arr, int left, int right)
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
     * @param arr String array to create a partition in
     * @param left left element position
     * @param right right element position
     * @return int representing the partition position in arr
     */
    public static int partition(String[] arr, int left, int right)
    {
        String pivot = arr[right];
        int i = left-1;

        for(int j = left;j<right;j++)
        {
            if(arr[j].compareTo(pivot)< 1)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return(i+1);
    }

    /**
     * Creates a partition to sort two sides separately
     * @param arr Comparable array to create a partition in
     * @param left left element position
     * @param right right element position
     * @return int representing the partition position in arr
     */
    public static int partition(Comparable[] arr, int left, int right)
    {
        Comparable pivot = arr[right];
        int i = left-1;

        for(int j = left;j<right;j++)
        {
            if(arr[j].compareTo(pivot)< 1)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return(i+1);
    }


    /**
     * Creates a partition to sort two sides separately
     * @param arr int array to create a partition in
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
     * Creates a partition to sort two sides separately
     * @param mids median array to create a partition in
     * @param norm normal array to sort
     * @param left left element position
     * @param right right element position
     * @return int representing the partition position in arr
     */
    public static int partition(int[] mids, int[][] norm, int left, int right)
    {
        int pivot = mids[right];
        int i = left-1;

        for(int j = left;j<right;j++)
        {
            if(mids[j]<=pivot)
            {
                i++;
                swap(mids,i,j);
                swap(norm,i,j);
            }
        }
        swap(mids,i+1,right);
        swap(norm,i+1,right);
        return(i+1);
    }


    /**
     * Sorts an array of integers using insertion sort
     * @param list1 array to sort
     */
    public static void insertionSort(int[] list1)
    {
        int swapPos;
        int min;

        for(int i = 1;i<list1.length;i++)
        {
            swapPos = i;
            min = list1[swapPos];

            for(int a = i-1;a>=0;a--)
            {
                if(list1[a]>min)
                {
                    swap(list1,swapPos,a);
                    swapPos = a;
                    min = list1[swapPos];
                }
                else
                {
                    a=-1;
                }
            }
        }
    }

    public static void insertionSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable key = arr[i];
            int x = i - 1;
            while ((x > -1) && (arr[x].compareTo(key) > 0)) {
                arr[x + 1] = arr[x];
                x--;
            }
            arr[x + 1] = key;
        }
    }

    /**
     * Sorts an array of Strings into alphabetical order using bubble sort
     * @param list1 array to sort
     */
    public static void bubbleSort(String[] list1)
    {
        int swapNum = 1;
        while(swapNum!=0)
        {
            swapNum = 0;
            for(int i = 0;i<list1.length-1;i++)
            {
                if(list1[i].compareTo(list1[i+1])>0)
                {
                    swap(list1,i,i+1);
                    swapNum++;
                }
            }
        }
    }

    /**
     * finds query in String array using binary search
     * @param arr array to go through
     * @param query String to find
     * @return idx of location of query or -1 if not found
     */
    public static int binarySearch(String[] arr, String query)
    {
        int left = 0;
        int right = arr.length-1;

        while(left <= right)
        {
            int mid = (left + right)/2;
            if(query.compareTo(arr[mid]) < 0)
            {
                right = mid-1;
            }
            else
            {
                if(query.compareTo(arr[mid]) > 0)
                {
                    left = mid+1;
                }
                else
                {
                    return(mid);
                }
            }
        }
        return -1;
    }

    /**
     * Finds query in Comparable array using binary search
     * @param arr array to go through
     * @param query Comparable to find
     * @return idx of the location of query in Comparable or -1 if not found
     */
    public static int binarySearch(Comparable[] arr, Comparable query)
    {
        int left = 0;
        int right = arr.length-1;

        while(left <= right)
        {
            int mid = (left + right)/2;
            if(query.compareTo(arr[mid]) < 0)
            {
                right = mid-1;
            }
            else
            {
                if(query.compareTo(arr[mid]) > 0)
                {
                    left = mid+1;
                }
                else
                {
                    return(mid);
                }
            }
        }
        return -1;
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

    /**
     * swaps two items in a Comparable object array
     * @param arr array we will swap items for
     * @param pos1 selected position value to swap
     * @param pos2 other selected position value to swap
     */
    public static void swap(Comparable[] arr,int pos1,int pos2)
    {
        Comparable temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    /**
     * swaps two items in a String array
     * @param arr array that we will swap items for
     * @param pos1 selected position value to swap
     * @param pos2 other selected position value to swap
     */
    public static void swap(String[] arr,int pos1,int pos2)
    {
        String temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    /**
     * swaps two items in a Double int array
     * @param arr double array whose contents we will swap
     * @param pos1 selected array position to swap
     * @param pos2 other selected array position to swap
     */
    public static void swap(int[][] arr,int pos1,int pos2)
    {
        int[] temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }


    /**
     * finds and returns the median in an int array
     * @param arr int array to find a median in
     * @return int representing the median of an int array
     */
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

    /**
     * prints a String representing an int array
     * @param list array to print
     */
    public static void toString(int[] list)
    {
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
     * prints a String representing a String array
     * @param list array to print
     */
    public static void toString(String[] list)
    {
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
     * prints a String representing a 2D array
     * @param list array to print
     */
    public static void toString(int[][] list)
    {
        String out = "";

        for(int i =0;i<list.length;i++)
        {
            for(int a = 0;a<list[i].length;a++)
            {
                out += list[i][a];
                if(a != list[i].length-1)
                {
                    out += ", ";
                }
            }
            out += "\n";
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

    /**
     * Makes a random array of Strings
     * @param num the length of the array
     * @param length the length of the Strings to be made
     * @return array of random Strings
     */
    public static String[] randStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while(num>0)
        {
            int i = 0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return(arr);
    }

}
