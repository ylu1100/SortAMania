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
         * We're doing a generic insertion sort, for correctness. May go back with new sorts later. arr is 10,000 elements long.
         * arr[] string lengths are 5.
         * @param arr
         * @param query
         * @return -1 if query is not an element in arr.
         */
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length-1; j++)
            {
                if (arr[i].compareTo(arr[j])>0)
                {
                    String a = arr[i];
                    arr[i] = arr[j];
                    arr[j]=a;
                }
            }
        }

        /**for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"");
        }**/

        //This part needs to come after the sort, since the sort is just a system out statement.
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i].contains(query))
            {
                return i;
            }
        }
        return -1;
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
        int a;
        int b;
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j <= arr[i].length - 1; j++)
            {
                for(int k = j; k <= arr[i].length - 1; k++)
                {
                    if (arr[i][j] > arr[i][k])
                    {
                        a = arr[i][k];
                        b = arr[i][j];
                        arr[i][k] = b;
                        arr[i][j] = a;
                    }
                }
            }
        }

        int[] med = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i].length % 2 > 0)
                med[i] = (arr[i][arr[i].length / 2] + arr[i][(arr[i].length / 2) + 1]) / 2;
            else
                med[i] = arr[i][arr[i].length / 2];
        }

        int[] c;
        int[] d;
        for(int i = 0; i < med.length; i++)
        {
            for(int j = i; j < med.length; j++)
            {
                if (med[i] > med[j])
                {
                    c = arr[i];
                    d = arr[j];
                    arr[i] = d;
                    arr[j] = c;

                    a = med[i];
                    b = med[j];
                    med[i] = b;
                    med[j] = a;
                }
            }
        }

        if(med.length % 2 > 0)
            return (med[med.length / 2] + med[(med.length / 2) + 1]) / 2;
        return med[med.length / 2];
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
       for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length-1; j++)
            {
                if (arr[i].compareTo(arr[j])>0)
                {
                    Comparable a=arr[i];
                    arr[i] = arr[j];
                    arr[j]=a;
                }
            }
        }

        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i].equals(query))
            {
                return i;
            }
        }
       return 0;
    }

    public String greeting()
    {
        return "e";
    }
}
