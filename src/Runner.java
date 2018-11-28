//Alexander Cox
//Wednesday, November 28, 2018

public class Runner {

    public void main (String[] args)
    {
        int[] c1Arr = randIntArr(100000);

        printArray(c1Arr);
        double startTime = System.nanoTime();
        System.out.print(AlexanderCoxSC.challengeOne(c1Arr));
        double time = (System.nanoTime() - startTime);
        System.out.println("Bubble Sort: " + (time / 1000000000) + "s");
        printArray(c1Arr);
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        return arr;
    }

    public static void printArray(int[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println("]\n");
    }
}
