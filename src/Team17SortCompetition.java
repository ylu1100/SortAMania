public class Team17SortCompetition {
    private int[] arr;
    public Team17SortCompetition(int[] arr)
    {
        this.arr = arr;

    }

    public void challenegeOne(int[] arr)
    {
        quickSort(arr, 0, arr.length-1);
        toStringInt(arr);
    }
//    public void quickSort(int[] arr, int left, int right)
//    {
//        if(left < right)
//        {
//            int pivot = partition(arr, left, right);
//
//            quickSort(arr, left, pivot-1);
//            quickSort(arr, pivot+1, right);
//        }
//    }
//    public int partition(int[] arr, int left, int right)
//    {
//        int pivot = right;
//        int i = left;
//        for(int j = left; j<right; j++)
//        {
//            if(arr[j] <= arr[pivot])
//            {
//                i++;
//                swapInt(arr, i,j);
//            }
//        }
//        swapInt(arr,i+1,right);
//        return i+1;
//    }
//
//    public static void swapInt(int[] array, int posOne, int posTwo)
//    {
//        int placeHolder = array[posOne];
//        array[posOne] = array[posTwo];
//        array[posTwo] = placeHolder;
//    }
    public void toStringInt(int[] list)
    {

        for (int x = 0; x < list.length; x++) {
                System.out.println(list[x]);
        }

    }
    }


