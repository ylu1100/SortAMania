public abstract class Team15SortCompetition extends SortCompetition {

    @Override
    public  String greeting() {
        return null;
    }

    @Override
    public  int challengeOne(int[] arr) {
        insertionSort(arr);
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
        insertionSort(arr);
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
        multiDSort(arr);
        return 0;
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

        return 0;
    }



    public static void insertionSort(int[] list1)
    {
        int pos;
        int min;

        for(int i = 1;i<list1.length;i++)
        {
            pos = i;
            min = list1[pos];

            for(int a = i-1;a>=0;a--)
            {
                if(list1[a]>min)
                {
                    swap(list1,pos,a);
                    pos = a;
                    min = list1[pos];
                }
                else
                {
                    a=-1;
                }
            }
        }
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

    public static void bucketSort(int[] arr)
    {
        int[][] bucket = bucket(arr);
        int pos = 0;
        for (int i=0; i < bucket.length;i++)
        {
            selectionSort(bucket[i]);
            for( int n=0; n < 1000 ;n++)
            {
                arr[pos] = bucket[i][n];
                pos++;
            }
        }
    }

    public static int[][] bucket(int[] arr)
    {
        int bucket[][] = new int[10][arr.length];
        int n1=0;
        int n0=0;
        int n2=0;
        int n3=0;
        int n4=0;
        int n5=0;
        int n6=0;
        int n7=0;
        int n8=8;
        int n9=9;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                bucket[0][n0] = arr[i];
                n0++;
            } else if (arr[i] < 2000) {
                bucket[1][n1] = arr[i];
                n1++;
            } else if (arr[i] < 3000) {
                bucket[2][n2] = arr[i];
                n2++;
            } else if (arr[i] < 4000) {
                bucket[3][n3] = arr[i];
                n3++;
            } else if (arr[i] < 5000) {
                bucket[4][n4] = arr[i];
                n4++;
            } else if (arr[i] < 6000) {
                bucket[5][n5] = arr[i];
                n5++;
            } else if (arr[i] < 7000) {
                bucket[6][n6] = arr[i];
                n6++;
            } else if (arr[i] < 8000) {
                bucket[7][n7] = arr[i];
                n7++;
            } else if (arr[i] < 9000) {
                bucket[8][n8] = arr[i];
                n8++;
            } else if (arr[i] < 10000) {
                bucket[9][n9] = arr[i];
                n9++;
            }

        }

        return bucket;
    }

    public static void swap(int[] arr, int pos1, int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }





}
