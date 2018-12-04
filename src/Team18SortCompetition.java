public class Team18SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        double median=0;
        insertionSort(arr);
        if(arr.length%2 == 0)
        {
            int i = arr[(arr.length/2)-1];
            System.out.println(i);
            int j = arr[arr.length/2];
            System.out.println(j);
            median = (i+j)/2;
        }
        else if (arr.length%2 !=0)
        {
            median = arr[arr.length/2];
        }
        return (int) median;
    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        bubbleSort(arr);
        int result = 0;

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i].equals(query))
            {
                result = i;
                return result;
            }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr)
    {
        double median=0;
        insertionSort(arr);
        if(arr.length%2 == 0)
        {
            int i = arr[(arr.length/2)-1];
            int j = arr[arr.length/2];
            median = (i+j)/2;
        }
        else if (arr.length%2 !=0)
        {
            median = arr[arr.length/2];
        }
        return (int) median;
    }


    @Override
    public int challengeFour(int[][] arr)
    {
        int[] medianArr = new int[arr.length];
        for(int i = 0;i<arr.length; i++)
        {
            insertionSort(arr[i]);
            medianArr[i] = (arr[i][1] + arr[i][2]) / 2;
        }
        insertionSort(medianArr);
        return (medianArr[1] + medianArr[2])/2;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {

        bubbleSort2(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].compareTo(query) == 0)
            {
                return i;
            }
        }
        return -1;
    }


    public String greeting() {
        return null;
    }

    public static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void doubleSwap(double[] arr, int pos1, int pos2){
        double temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void bubbleSort(String[] arr)
    {
        boolean checkStorted = false;
        int a = arr.length-1;
        while(!checkStorted)
        {
            checkStorted = true;
            for(int i=0; i<a; i++)
            {
                if(arr[i].compareTo(arr[i+1]) > 0 )
                {
                    String Temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = Temp;
                    checkStorted = false;
                }
            }
            a--;
        }
    }
    public static void bubbleSort2(Comparable[] arr)
    {
        boolean checkStorted = false;
        int a = arr.length-1;
        while(!checkStorted)
        {
            checkStorted = true;
            for(int i=0; i<a; i++)
            {
                if(arr[i].compareTo(arr[i+1]) > 0 )
                {
                    Comparable Temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = Temp;
                    checkStorted = false;
                }
            }
            a--;
        }
    }
    public static void mergeSort(String[] arr)
    {










    }

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

    public static void selectionSort(double[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++){
            temp = i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            doubleSwap(arr, temp, i);
        }
    }

    public static int[] generateIntArr(int x)
    {
        int[] z = new int[x];
        for(int i=0;i<x;i++)
        {
            z[i] = (int)(Math.random()*10000);
        }
        return z;
    }
    public static int findMedian(int[] arr)
    {
        int median = 0;
        if(arr.length%2 == 0)
        {
            median = (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        if(arr.length%2 != 0)
        {
            median =  arr[(arr.length-1)/2];
        }
        return median;
    }

}
