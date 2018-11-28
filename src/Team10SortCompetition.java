public abstract class Team10SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr)
    {
        int temp1 = 0;
        int temp2 = 0;
        int median = 0;
        for (int i = 0;i<arr.length;i++)
        {
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
        median = ((arr[5000]+arr[5001])/2);
        return median;
    }
}
