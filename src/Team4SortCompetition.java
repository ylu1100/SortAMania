public class Team4SortCompetition extends SortCompetition {

    // Use Merge sort in order to organize the integer array + Helper Methods

    public int challengeOne(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        sort(arr,left,right);
        return (findMedian(arr));
    }
    public void sort(int[] arr,int left,int right)
    {
        if(left<right){
            int pivot = partition(arr,left,right);
            sort(arr,left,pivot-1);
            sort(arr,pivot+1,right);
        }
    }
    public int partition(int[] arr, int left, int right)
    {
        int temp;
        int pivot = arr[right];
        int i = left-1;
        for(int j = left ;j<right;j++){
            if(arr[j]<= pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }
    public int findMedian(int[] arr)
    {
        int med =0;
        int l = arr.length;
        if(l%2 > 0){
            l++;
        }
        l = l/2;
        med = arr[l];
        return med;
    }

    //  Set a  temporary numerical array in order to be able to sort easier


    public int challengeTwo(String[] str, String query)
    {
        int left = 0;
        int right = str.length;
        int[] arr = convert(str);
        sort(arr,left,right);
        return 0;
    }
    public int[] convert(String[] str)
    {
        int[] arr = new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            int idx = 0;
            int multiplier = 10000;
            for(int j=0;j<str[i].length();j++)
            {}
        }
        return arr;
    }

    //  Regular sort

    public int challengeThree(int[] arr)
    {
        return 0;
    }

    // Create a multi dimensional sorting algorithm

    public int challengeFour(int[][] arr)
    {
        return 0;
    }

    // Use a regular sort and create another method for searching.

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        return 0;
    }
}
