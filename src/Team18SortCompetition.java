public class Team18SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        double median;
        insertionSort(arr);
        if(arr.length%2 == 0)
        {
            int i = arr[(arr.length/2)+1];
            int j = arr[arr.length/2];
            median = (i+j)/2;
        }
        else
        {
            median = arr[arr.length/2];
        }
        return (int) median;
    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        bubbleSort(arr);
        int i=0;
        int result = 0;
        boolean check = false;
        while(check != true)
        {
            i +=1;
            if(arr[i].compareTo(query)>=0)
            {
                result = i;
                check = true;
            }
            else if((arr[i].compareTo(query)<=0)&&(i == arr.length))
            {
                result = -1;
                check = true;
            }
        }
        return result;
    }

    @Override
    public int challengeThree(int[] arr) {

        double median;
        insertionSort(arr);
        if(arr.length%2 == 0)
        {
            int i = arr[(arr.length/2)+1];
            int j = arr[arr.length/2];
            median = (i+j)/2;
        }
        else
        {
            median = arr[arr.length/2];
        }
        return (int) median;
    }


    @Override
    public int challengeFour(int[][] arr)
    {
        int median = 0;
        for(int i = 0;i<arr.length; i++)
        {
            insertionSort(arr[i]);
        }
        if(arr.length%2!=0)
        {
            median = arr[500][500];
        }
        else
        {
            median = (arr[])
        }
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
                    else
                        { break; }
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

    Team18SortCompetition x = new Team18SortCompetition();

    int[] c1 = generateIntArr(6);

    printIntArray(c1);

    long timer = System.nanoTime();

        System.out.println("median is " + x.challengeOne(c1));

    timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

    printIntArray(c1);




    String[] c2 = {"abcde","cdefe","aaaaa","bbbbb"};
    printStringArray(c2);
    timer = System.nanoTime();
        System.out.println(x.challengeTwo(c2,"abcde"));
    timer = System.nanoTime() - timer;
        System.out.println(timer*.000000001 + " seconds");

    printStringArray(c2);
}

    public static int[] generateIntArr(int x)
    {
        int[] z = new int[x];
        for(int i=0;i<x;i++)
        {
            z[i] = (int)(Math.random()*10000);
        }
        return z;
    }
    public static void printIntArray(int[] arr){
        String temp = "";
        for(int i=0;i<arr.length;i++){
            temp+= arr[i] + ", ";
        }
        System.out.println(temp);
    }

}
