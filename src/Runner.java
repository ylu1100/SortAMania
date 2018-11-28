public class Runner
{
    public static void main(String[] args)
    {
        int[] arr= new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10)+1;
        }
        System.out.print("Unsorted Array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(challengeOne);

        long time = System.nanoTime();


        System.out.println((double)(System.nanoTime() - time)/(100000000)+" secs");
        System.out.print(a);


    }
}
/*
int n = arr.length;
        int[] temp = new int[n];
        private void mergeSortHelper mergeSortHelper(arr, 0, n - 1, temp);

        ( int[] elements, int from, int to, int[] temp)
        {
            if (from < to) {
                int middle = (from + to) / 2;
                mergeSortHelper(elements, from, middle, temp);
                mergeSortHelper(elements, middle + 1, to, temp);
                merge(elements, from, middle, to, temp);
            }
        }
        public void merge ( int[] arr, int left, int mid, int right, int[] temp)
        {
            int i = left;
            int j = mid + 1;
            int k = left;
            while (i <= mid && j <= right) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            while (j <= right) {
                temp[k] = arr[j];
                j++;
                k++;
            }
            for (int m = left; m <= right; m++) {
                arr[m] = temp[m];
            }
        }
 */