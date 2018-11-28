public class Team18SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }

    public static void intSwap(int[] arr, int pos1, int pos2){
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

    public static void insertionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                for(int j=i ; j>0 ; j--)
                {
                    if(arr[i]<arr[j])
                    {
                        intSwap(arr,j,i);
                    }
                    else { break; }
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
}
