public abstract class Team15SortCompetition extends SortCompetition {

    @Override
    public  String greeting() {
        return null;
    }

    @Override
    public  int challengeOne(int[] arr) {
        mergeSort(arr);
        return findMedian(arr);
    }

    @Override
    public  int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public  int challengeThree(int[] arr) {
        mergeSort(arr);
        return findMedian(arr);
    }

    @Override
    public  int challengeFour(int[][] arr) {
        multiDSort(arr);
        return 0;
    }

    @Override
    public  int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }


    public static String greet()
    {
        return null;
    }

    public static int c1(int[] arr)
    {
        mergeSort(arr);
        return findMedian(arr);
    }

    public static int c2(String [] arr, String query)
    {
        return 0;
    }

    public static int c3(int[] arr)
    {
        mergeSort(arr);
        return findMedian(arr);
    }

    public static int c4(int[][] arr)
    {
        return multiDSort(arr);
    }

    public static int c5(Comparable[] arr, Comparable query)
    {
        return 0;
    }


    public static int multiDSort(int[][] arr)
    {
        for (int i=0; i< arr.length; i++)
        {
            mergeSort(arr[i]);
        }
        insertionSort(arr);
        /*
         for (int i= 0; i < arr.length; i++)
         {
             String output = "Array ["+i+"]: ";
             for(int n=0; n <arr[i].length;n++)
             {
                 output += " "+String.valueOf(arr[i][n]);
             }
             System.out.println(output + " The Median is: "+ findMedian(arr[i]));
         }
         */
        return ((findMedian(arr[arr.length/2]) + findMedian(arr[(arr.length+1)/2]))/2);

    }


    public static int findMedian(int[] arr)
    {
        if (arr.length%2 ==0)
        {
            return (arr[arr.length/2] + arr[(arr.length/2) +1])/2;
        } else
        {
            return arr[arr.length / 2];
        }
    }


    public static void insertionSort(int[][] list1)
    {
        int pos;
        int min;

        for(int i = 1;i<list1.length;i++)
        {
            pos = i;
            min = findMedian(list1[pos]);

            for(int a = i-1;a>=0;a--)
            {
                if(findMedian(list1[a])>min)
                {
                    swap(list1,pos,a);
                    pos = a;
                    min = findMedian(list1[pos]);
                }
                else
                {
                    a=-1;
                }
            }
        }
    }



    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0,n-1, temp);
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        int i = left;
        int n= mid+1;
        int l=left;
        while(i<= mid && n<=right)
        {
            if(arr[i]<arr[n])
            {
                temp[l]=arr[i];
                i++;
            }
            else {
                temp[l]=arr[n];
                n++;
            }
            l++;
        }
        while(i<=mid)
        {
            temp[l]=arr[i];
            i++;
            l++;
        }
        while(n<=right)
        {
            temp[l]=arr[n];
            n++;
            l++;
        }
        for(int j=left;j<=right;j++)
        {
            arr[j]=temp[j];
        }
    }



    public static void selectionSort(int[] elements) {
        for (int j = 0; j < elements.length-1;j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

    public static void swap(int[] arr, int pos1, int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void swap(int[][] arr, int pos1, int pos2)
    {
        int[] temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

    }




}
