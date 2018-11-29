public class Team5SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length - 1; j++)
            {
                if (arr[i] > arr[j])
                {
                    a = arr[i];
                    b = arr[j];
                    arr[i] = b;
                    arr[j] = a;
                }
            }
        }
        if(arr.length % 2 > 0)
            return (arr[arr.length / 2] + arr[(arr.length / 2) + 1]) / 2;
        return arr[arr.length / 2];
    }

    public int challengeTwo(String[] arr, String query)
    {
        /**
         * We're doing a genric insertion sort, for correctness. May go back with new sorts later. arr is 10,000 elements long.
         * arr[] string lengths are 5.
         * @param arr
         * @param query
         * @return -1 if query is not an element in arr.
         */
        //int a = 0;
        //int b = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            String a=arr[i];
            for(int j = i; j >= 0; j--)
            {
                if (arr[i].compareTo(arr[j])==-1)
                {
                    arr[i] = arr[j];
                    arr[j]=a;
                }
            }
        }
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }

        //This part needs to come after the sort, since the sort is just a system out statement.
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i].equals(query))
            {
                return i;
            }
        }
        return 0;
    }
    

    public int challengeThree(int[] arr)
    {
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length - 1; j++)
            {
                if (arr[i] > arr[j])
                {
                    a = arr[i];
                    b = arr[j];
                    arr[i] = b;
                    arr[j] = a;
                }
            }
        }
        if(arr.length % 2 > 0)
            return (arr[arr.length / 2] + arr[(arr.length / 2) + 1]) / 2;
        return arr[arr.length / 2];
    }

    public int challengeFour(int[][] arr)
    {
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        return 0;
    }

    public String greeting()
    {
        return "e";
    }
}
