/*TRAFVIS*/
public class Team10SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        /*int temp1;
        int temp2 = 0;
        for (int i = 0; i < arr.length; i++)
        {
            temp1 = i;
            temp2 = arr[i];
            for (int x = i; x < arr.length; x++)
            {
                if (arr[i] < temp2)
                {
                    temp1 = x;
                    temp2 = arr[x];

                }
            }
            arr[temp1] = arr[i];
            arr[i] = temp2;
        }
        int median = ((arr[5000] + arr[5001]) / 2);
        return median;
        */
        int swaps = 1;
        int temp = 0;
        while(swaps!=0)
        {
            swaps = 0;
            for(int i =0; i< arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }
            }
        }
        int median = ((arr[5000] + arr[5001]) / 2);
        return median;
    }

    public int challengeTwo(String[] arr, String query)
    {
        /*String temp = "";
        int x = 0;
        int wordPos = -1;
        boolean sorting = false;
        while (sorting = false)
        {
            for (int i = 0; i < arr.length; i++)
            {
                x = arr[i].compareTo(arr[i + 1]);
                if ((arr[i].compareTo(query) == 0))
                {
                    wordPos = i;
                }
                if (x < 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for (int a = 0; a < arr.length; a++)
            {
                if (arr[a].compareTo(arr[a + 1]) > 0)
                {
                    sorting = true;
                }
            }
        }
        return wordPos;
        */
        int swaps = 1;
        String temp = "";
        int answer = -1;
        while(swaps!=0)
        {
            swaps = 0;
            for(int i =0; i< arr.length-1;i++)
            {
                if(arr[i].compareTo(arr[i+1])==1)
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }
                if(arr[i].compareTo(query)==0)
                {
                    answer = i;
                }
            }
        }
        return answer;
    }

    public int challengeThree(int[] arr)
    {
        /*int temp1 = 0;
        int temp2 = 0;
        int median = 0;
        for (int i = 0; i < arr.length; i++)
        {
            temp1 = i;
            for (int x = i; x < arr.length; x++)
            {
                if (arr[i] < temp2)
                {
                    temp1 = x;
                    temp2 = arr[x];
                }
            }
            arr[temp1] = arr[i];
            arr[i] = temp2;
        }
        median = ((arr[50000] + arr[50001]) / 2);
        return median;
        */
        int swaps = 1;
        int temp = 0;
        while(swaps!=0)
        {
            swaps = 0;
            for(int i =0; i< arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }
            }
        }
        int median = ((arr[50000] + arr[50001]) / 2);
        return median;
    }
    public int challengeFour(int[][] arr)
    {
        return 0;
    }
    public int challengeFive(Comparable[] arr, Comparable query)
    {return 0;

    }

    public String greeting()
    {
        return "as";
    }



}
