public class Team0SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n-1, temp);

        public void mergeSortHelper(int[] elements, int from, int to, int[] temp)
        {
            if (from < to)
            {
                int middle = (from + to) / 2;
                mergeSortHelper(elements, from, middle, temp);
                mergeSortHelper(elements, middle + 1, to, temp);
                merge(elements, from, middle, to, temp);
            }
        }
        public void merge(int[] arr, int left, int mid, int right, int[] temp)
        {
            int i = left;
            int j= mid+1;
            int k=left;
            while(i<= mid&&j<=right)
            {
                if(arr[i]<arr[j])
                {
                    temp[k]=arr[i];
                    i++;
                }
                else {
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }
            while(i<=mid)
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            while(j<=right)
            {
                temp[k]=arr[j];
                j++;
                k++;
            }
            for(int m=left;m<=right;m++)
            {
                arr[m]=temp[m];
            }
        }


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
}
