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
