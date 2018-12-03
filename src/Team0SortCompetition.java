public class Team0SortCompetition extends SortCompetition
{
    @Override
    public int challengeOne(int[] arr)
    {
        boolean done=false;
        while(!done)
        {
            done=true;
            for(int i=0;i<arr.length-1;i++)
            {
                int a=arr[i];
                int b=arr[i+1];
                if(a>b)
                {
                    done=false;
                    arr[i]=b;
                    arr[i+1]=a;

                }
            }
        }
        int sum =arr[5000]+arr[4999];
        int a= sum/2;
        return a;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        int a = 1;
        String y;
        while(a != 0)
        {
            a = 0;
            for(int i = 0; i < arr.length-1; i++)
            {
                if(arr[i].compareTo(arr[i+1]) > 0)
                {
                    y = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = y;
                    a++;
                }
            }
        }
        for(int l=0;l<arr.length;l++)
        {
            if(query.equals(arr[l]))
            {
                return l;
            }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr) {
        int N = arr.length;
        int i;
        int j;
        int temp;
        for (i = 1; i< N; i++)
        {
            j = i;
            temp = arr[i];
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;
        }
        int sum =arr[50000]+arr[49999];
        int a= sum/2;
        return a;
    }

    @Override
    public int challengeFour(int[][] arr) {
        int[] hold=new int[1000];

        int insideM;
        for(int i=0;i<arr.length;i++) {
            insideM = sorter1(arr[i]);
            hold[i] = insideM;
        }
        int answer =sorter1(hold);
        return answer;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {


        /*
        int a = 1;
        Comparable y;
        while(a != 0)
        {
            a = 0;
            for(int i = 0; i < arr.length-1; i++)
            {
                if(arr[i].compareTo(arr[i+1]) > 0)
                {
                    y = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = y;
                    a++;
                }
            }
        }
        for(int l=0;l<arr.length;l++)
        {
            if(query.equals(arr[l]))//change maybe
            {
                return l;
            }
        }
        return -1;
        */
    }

    @Override
    public String greeting() {
        return null;
    }
    public int sorter1(int[] arr) {
        int N = arr.length;
        int i;
        int j;
        int temp;
        for (i = 1; i< N; i++)
        {
            j = i;
            temp = arr[i];
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;
        }
        int sum =arr[500]+arr[499];
        int a= sum/2;
        return a;
    }
}
