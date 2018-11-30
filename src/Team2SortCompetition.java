import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.min;

public class Team2SortCompetition extends SortCompetition{

    /**
     * Data Set - an array of 10,000 random integers between 0-10000
     * @param challenge1 First challenge array.
     * @return Task: Sort the list and return the median(Round down if double)
     */
    public int challengeOne(int[] challenge1)
    {
        double median;
        for(int i=0;i<challenge1.length;i++)
        {
            int cMin = challenge1[i];
            int x = i - 1;
            while(x>=0 && challenge1[x] > cMin)
            {
                challenge1[x+1] = challenge1[x];
                x--;
            }
            challenge1[x+1] = cMin;
        }
        if(challenge1.length % 2 == 0)
        {
            median = ((double)challenge1[(challenge1.length/2)] + (double)challenge1[(challenge1.length/2) - 1])/2;
        }
        else
        {
            median = (double)challenge1[challenge1.length/2];
        }
        return (int)median;
    }

    /**
     * Data Set - an array of 10,000 random strings (strings will be of length 5)
     * @param challenge2 Array for challenge 2.
     * @param query String to check for.
     * @return Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found
     */
    public int challengeTwo(String[] challenge2, String query)
    {
        mergeSortStrings(challenge2);
        if(Arrays.asList(challenge2).contains(query))
        {
            List<String> challenger2 = Arrays.asList(challenge2);
            return (challenger2.indexOf(query));
        }
        else
        {
            return (-1);
        }
    }

    /**
     * Merge Sort for Strings
     * @param challenge5 Array to be sorted.
     */
    public static void mergeSortStrings(String[] challenge5)
    {
        int n = challenge5.length;
        String[] tempc = new String[n];
        mergeSortStringHelper(challenge5, 0,n-1,tempc);
    }

    /**
     * Creates merges calls for recursion.
     * @param challenge5 Array to be sorted.
     * @param leftc Left.
     * @param rightc Right.
     * @param tempc Temporary array to move elements to.
     */
    public static void mergeSortStringHelper(String[] challenge5, int leftc, int rightc, String[] tempc)
    {
        if(leftc < rightc)
        {
            int middlec = (leftc + rightc) / 2;
            mergeSortStringHelper(challenge5, leftc, middlec, tempc);
            mergeSortStringHelper(challenge5, middlec + 1, rightc, tempc);
            mergeStrings(challenge5, leftc, middlec, rightc, tempc);
        }
    }

    /**
     * Merges the String arrays back together.
     * @param challenge5 Array to be sorted.
     * @param leftc Left.
     * @param middlec Middle.
     * @param rightc Right.
     * @param tempc Temp array to move elements to.
     */
    public static void mergeStrings(String[] challenge5, int leftc, int middlec, int rightc, String[] tempc)
    {
        for(int i = leftc; i <= rightc; i++)
        {
            tempc[i] = challenge5[i];
        }
        int i = leftc;
        int j = middlec + 1;
        int k = leftc;
        while(i <= middlec && j <= rightc)
        {
            if(tempc[i].compareTo(tempc[j]) < 0)
            {
                challenge5[k] = tempc[i];
                i++;
            }
            else
            {
                challenge5[k] = tempc[j];
                j++;
            }
            k++;
        }
        while(i <= middlec)
        {
            challenge5[k] = tempc[i];
            k++;
            i++;
        }
        while(j <= rightc)
        {
            challenge5[k] = tempc[j];
            k++;
            j++;
        }
    }

    /**
     * Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
     * @param challenge3 Array for third challenge.
     * @return Task: Sort the list and return the median
     */
    public int challengeThree(int[] challenge3)
    {
        double median;
        int n = challenge3.length;
        for (int i=1; i<n; ++i)
        {
            int key = challenge3[i];
            int j = i-1;
            while (j>=0 && challenge3[j] > key)
            {
                challenge3[j+1] = challenge3[j];
                j = j-1;
            }
            challenge3[j+1] = key;
        }
        if(challenge3.length % 2 == 0)
        {
            median = ((double)challenge3[(challenge3.length/2)] + (double)challenge3[(challenge3.length/2) - 1])/2;
            median = Math.floor(median);
        }
        else
        {
            median = (double)challenge3[challenge3.length/2];
        }
        return (int)median;
    }

    /**
     * Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
     * Return the median of the median array
     * @param challenge4 Array for challenge 4.
     * @return Task: Sort each sub-array and then sort the arrays by their median value
     */
    public int challengeFour(int[][] challenge4)
    {
        double median;
        int[]rowMediums = new int[challenge4.length];
        for(int i=0;i<challenge4.length;i++)
        {
            quicksort(challenge4[i],0,challenge4.length-1);
            rowMediums[i] = (challenge4[i][(challenge4.length/2)-1] + challenge4[i][challenge4.length/2])/2;
        }
        quicksort2(rowMediums,challenge4,0,rowMediums.length-1);
        median = (rowMediums[(rowMediums.length/2)-1] + rowMediums[rowMediums.length/2])/2;
        System.out.println((int)median);
        return (int)median;
    }

    public static void quicksort(int[] arr,int l, int r)
    {
        if(l<r)
        {
            int pivot = partition(arr, l, r);
            quicksort(arr, l,pivot-1);
            quicksort(arr,pivot+1, r);
        }
    }

    public static int partition(int[] arr, int l, int r)
    {
        int pivot = arr[r];
        int i = l-1;
        for(int j=l;j<r;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }

    public static void quicksort2(int[] arr,int[][] arr2,int l, int r)
    {
        if(l<r)
        {
            int pivot = partition2(arr,arr2, l, r);
            quicksort2(arr, arr2,l,pivot-1);
            quicksort2(arr,arr2,pivot+1, r);
        }
    }

    public static int partition2(int[] arr,int[][] arr2,int l, int r)
    {
        int pivot = arr[r];
        int i = l-1;
        for(int j=l;j<r;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                int[] temp2 = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp2;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        int[] temp2 = arr2[i+1];
        arr2[i+1] = arr2[r];
        arr2[r] = temp2;
        return i+1;
    }

    /**
     * Data Set - an array of 10,000 objects that implement the comparable interface
     * Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order.
     * @param challenge5 Array for Challenge 5.
     * @param cquery Object to be found.
     * @return Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
     */
    public int challengeFive(Comparable[] challenge5, Comparable cquery)
    {
        mergeSortC(challenge5);
        if(Arrays.asList(challenge5).contains(cquery))
        {
            List<Comparable> challenger5 = Arrays.asList(challenge5);
            return (challenger5.indexOf(cquery));
        }
        else
        {
            return (-1);
        }
    }

    /**
     * Merge sort for comparable.
     * @param challenge5 Array to be inputted.
     */
    public static void mergeSortC(Comparable[] challenge5)
    {
        int n = challenge5.length;
        Comparable[] tempc = new Comparable[n];
        mergeSortC(challenge5, 0,n-1,tempc);
    }

    /**
     * Recursion step.
     * @param challenge5 Array to be inputted.
     * @param leftc left value
     * @param rightc right value
     * @param tempc temp array
     */
    public static void mergeSortC(Comparable[] challenge5, int leftc, int rightc, Comparable[] tempc)
    {
        if(leftc < rightc)
        {
            int middlec = (leftc + rightc) / 2;
            mergeSortC(challenge5, leftc, middlec, tempc);
            mergeSortC(challenge5, middlec + 1, rightc, tempc);
            mergeStringsC(challenge5, leftc, middlec, rightc, tempc);
        }
    }

    /**
     * Merges the arrays.
     * @param challenge5 Array to be inputted.
     * @param leftc left value
     * @param middlec middle value
     * @param rightc right value
     * @param tempc temp array
     */
    public static void mergeStringsC(Comparable[] challenge5, int leftc, int middlec, int rightc, Comparable[] tempc)
    {
        for(int i = leftc; i <= rightc; i++)
        {
            tempc[i] = challenge5[i];
        }
        int i = leftc;
        int j = middlec + 1;
        int k = leftc;
        while(i <= middlec && j <= rightc)
        {
            if(tempc[i].compareTo(tempc[j]) < 0)
            {
                challenge5[k] = tempc[i];
                i++;
            }
            else
            {
                challenge5[k] = tempc[j];
                j++;
            }
            k++;
        }
        while(i <= middlec)
        {
            challenge5[k] = tempc[i];
            k++;
            i++;
        }
        while(j <= rightc)
        {
            challenge5[k] = tempc[j];
            k++;
            j++;
        }
    }

/**
 * Basic greeting.
 * @return Greeting.
 */
    public String greeting()
    {
        return "Welcome to Team Super Sorter's Very Cool Omega Sorting Bot";
    }
}
