import java.util.Arrays;

public abstract class Team15SortCompetition extends SortCompetition {

    @Override
    public  String greeting() {
        return "\n And Here Come's Team 15's Sorting Algorithms. Nazmus & Sabrun will without a doubt be the winners today! \n";
    }

    @Override
    public  int challengeOne(int[] arr) {
        mergeSort(arr);
        return findMedian(arr);
    }

    @Override
    public  int challengeTwo(String[] arr, String query) {
        insertionSort(arr);
        for (int i=0; i < arr.length;i++)
        {
            if (arr[i].equals(query))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public  int challengeThree(int[] arr) {
        mergeSort(arr);
        return findMedian(arr);
    }

    @Override
    public  int challengeFour(int[][] arr) {
        return multiDSort(arr);
    }

    @Override
    public  int challengeFive(Comparable[] arr, Comparable query) {
        bubbleSort(arr);
        for(int i=0; i < arr.length; i++)
        {
            if (arr[i].compareTo(query) >0)
            {
                return i;
            }
        }
        return -1;
    }


    public static String greet()
    {
        return "\n And Here Come's Team 15's Sorting Algorithms. Nazmus & Sabrun will without a doubt be the winners today! \n";
    }

    public static int c1(int[] arr)
    {
        mergeSort(arr);
        return findMedian(arr);
    }

    public static int c2(String [] arr, String query)
    {
        insertionSort(arr);
        for (int i=0; i < arr.length;i++)
        {
            if (arr[i].equals(query))
            {
                return i;
            }
        }
        return -1;
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

    public static int findStr(String[] arr, String str)
    {
        for (int i=0; i <arr.length; i++)
        {
            if (arr[i].equals(str))
            {
                return i;
            }
        }
        return -1;
    }

    public static int multiDSort(int[][] arr)
    {
        for (int i=0; i< arr.length; i++)
        {
            mergeSort(arr[i]);
        }
        insertionSort(arr);

        /* for (int i= 0; i < arr.length; i++)
         {
             String output = "Array ["+i+"]: ";
             for(int n=0; n <arr[i].length;n++)
             {
                 output += " "+String.valueOf(arr[i][n]);
             }
             System.out.println(output + " The Median is: "+ findMedian(arr[i]));
         }
        */
        return ((findMedian(arr[(arr.length)/2]) + findMedian(arr[(arr.length/2)-1]))/2);

    }


    public static int findMedian(int[] arr)
    {
        if (arr.length%2 ==0)
        {
            return (arr[(arr.length)/2] + arr[(arr.length/2) -1])/2;
        } else
        {
            return arr[(arr.length +1 )/ 2];
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

    public static void insertionSort(String[] list1)
    {
        int pos;
        String min;

        for(int i = 1;i<list1.length;i++)
        {
            pos = i;
            min = list1[pos];

            for(int a = i-1;a>=0;a--)
            {
                if(list1[a].compareTo(min)>0)
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

    public static void bubbleSort(Comparable[] arr)
    {
        int swapCount = 1;
            while (swapCount != 0)
            {
                swapCount = 0;
                for (int i = 0; i < arr.length - 1; i++)
                {
                    if (arr[i].compareTo(arr[i + 1]) > 0)
                    {
                        Comparable temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapCount++;
                    }
                }
            }
    }


    public static void swap(Comparable[] arr, int pos1, int pos2)
    {
        Comparable temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void swap(String[] arr, int pos1, int pos2)
    {
        String temp = arr[pos1];
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
