public class quickSort
{
    public static void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int left, int right)
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
}
