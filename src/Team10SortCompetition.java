public abstract class Team10SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr)
    {
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int median = 0;
        for (int i = 0;i<arr.length;i++)
        {
            temp3 = arr[i+1];
            temp1 = i;
            for(int x = i;x<arr.length;x++)
            {
                if (arr[i]<temp2)
                {
                    temp1 = x;
                    temp2 = arr[x];
                }
            }
            arr[temp1] = arr[i];
            arr[i] = temp2;
        }

    }
}
public int challengeTwo(String[] arr, String query)
{
    String temp = "";
    int x = 0;
    boolean sorting = false;
    {
        while (sorting = false)
        {
            for (int i = 0; i < arr.length; i++)
            {
                x = arr[i].compareTo(arr[i + 1]);
                if (x < 0)
                {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
    }
}
}
