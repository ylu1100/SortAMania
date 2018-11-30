import java.util.Random;

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
        System.out.println(a.challengeTwo(arr, "ABCDEFGHIJKLMNOPQRST"));
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
        Comparable[] arrC = compArr();
        //Unsorted comparison.
        for(int i = 0; i < arrC.length - 1; i++)
        {
            System.out.print(arrC[i] + " ");
        }
        startTime = System.currentTimeMillis();
        System.out.println(a.challengeFive(arrC, "generic"));
        endTime = System.currentTimeMillis();
        System.out.println("C5 took " + (endTime - startTime) + " milliseconds.");
        for(int i = 0; i < arrC.length - 1; i++)
        {
            System.out.print(arrC[i] + " ");
        }
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
    public static boolean getRandomBoolean()
    {
        return Math.random() < 0.5;
    }
    public static char getRandomChar()
    {
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        return c;
    }

        public static Comparable[] compArr()
        {
            //Maybe these specific instances of objects that implement compareTo, aren't the ones that will be tested.
            //It will probably be a set of related (ancestor/descendant) classes that will return an int based on their
            //own compareTo method.
            //Maybe just test this with ints or something, and organize them into a list.
            Comparable[] arr= new Comparable[10000];
            int j=0;
            while (j<10000)
            {
                arr[j]=(int)(Math.random()*1000);
                arr[j+1]=(int)(Math.random()*1000);
                arr[j+2]=(int)(Math.random()*1000);
                arr[j+3]=(int)(Math.random()*1000);
                arr[j+4]=(int)(Math.random()*1000);
                j=j+5;
               /** if (j==9995)
                {
                    arr[j]=getRandomBoolean();
                    arr[j+1]=(int)Math.random()*1000;
                    arr[j+2]=Math.random()*1000;
                    arr[j+3]=stringArrs()[(int)(Math.random()*9000)];
                    arr[j+4]=getRandomChar();
                    //arr[j+5]=getRandomBoolean();
                    return arr;
                }

                arr[j]=getRandomBoolean();
                arr[j+1]=(int)(Math.random()*1000);
                arr[j+2]=Math.random()*1000;
                arr[j+3]=stringArrs()[(int)Math.random()*9000];
                arr[j+4]=getRandomChar();
                j=j+5;**/
            }
            return arr;
        }

}
