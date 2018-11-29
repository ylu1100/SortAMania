public class Runner
{
    public static int[] array = new int[10000];
    public static int[] array1 = new int[10000];
    public static int[][] array2 = new int[1000][1000];
    public static void main(String[] args)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            array[i] = (int)(Math.random() * 10000) + 1;
        }

        for(int i = 0; i < array1.length - 1; i++)
        {
            array1[i] = (int)(Math.random() * 10000) + 1;
        }

        for(int i = 0; i < array2.length - 1; i++)
        {
            for(int j = 0; j < array2[i].length - 1; j++)
            {
                array2[i][j] = (int)(Math.random() * 10000) + 1;
            }
        }

        Team5SortCompetition a = new Team5SortCompetition();

        double startTime = System.currentTimeMillis();
        System.out.println(a.challengeOne(array));
        double endTime = System.currentTimeMillis();
        System.out.println("C1 took " + (endTime - startTime) + " milliseconds.");

        for(int i = 0; i < array.length - 1; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        System.out.println("");
        startTime = System.currentTimeMillis();
        String[] arr= stringArrs();
        System.out.println(a.challengeTwo(arr, "je"));
        endTime = System.currentTimeMillis();
        System.out.println("C2 took " + (endTime - startTime) + " milliseconds.");

        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println("");
        startTime = System.currentTimeMillis();
        System.out.println(a.challengeThree(array1));
        endTime = System.currentTimeMillis();
        System.out.println("C3 took " + (endTime - startTime) + " milliseconds.");

        for(int i = 0; i < array1.length - 1; i++)
        {
            System.out.print(array1[i] + " ");
        }

        System.out.println("");
        System.out.println("");
        startTime = System.currentTimeMillis();
        System.out.println(a.challengeFour(array2));
        endTime = System.currentTimeMillis();
        System.out.println("C4 took " + (endTime - startTime) + " milliseconds.");
        for(int i = 0; i < array2[0].length - 1; i++)
            System.out.print(array2[0][i] + " ");


        System.out.println("");
        System.out.println("");
        startTime = System.currentTimeMillis();
        Comparable[] arrC = compArr();
        System.out.println("C5");
        for (int i = 0; i < arrC.length - 1; i++) {
            System.out.print(arrC[i] + " ");
        }
        /**System.out.println(a.challengeFive(arrC, "generic"));
         endTime = System.currentTimeMillis();
         System.out.println("C5 took " + (endTime - startTime) + " milliseconds.");
         for(int i = 0; i < array.length - 1; i++)
         {
         System.out.print(array[i] + " ");
         }**/

    }

    public static String[] stringArrs()
    {
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr=new String[10000];
        for(int i=0; i<10000; i++)
        {
            String stringStor=alphabet.substring((int)(Math.random()*25), alphabet.length()-1);
            arr[i]=stringStor;
        }
        return arr;
    }
        public static Comparable[] compArr()
        {
            Comparable[] arr= new Comparable[10000];
            int j=0;
            for (int i=0; i<10000; i++)
            {
                int truei=0;
                if (i==9996)
                {
                    arr[i]=true;
                    return arr;
                }

                arr[i]=true;
                arr[i+1]=56;
                arr[i+2]=0.56;
                arr[i+2]="yo";
                arr[i+3]='r';

            }
            while (j<10000)
            {
                if (j>=9996)
                {
                    arr[j]=true;
                    return arr;
                }

                arr[j]=true;
                arr[j+1]=56;
                arr[j+2]=0.56;
                arr[j+2]="yo";
                arr[j+3]='r';
                j=j+4;
            }
            return arr;
        }

}
