public class Runner
{
    public static void main(String[] args)
    {
        int[] arr= new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10)+1;
        }
        System.out.print("Unsorted Array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        long time = System.nanoTime();
        Team0SortCompetition.challengeOne(arr);
        System.out.println((double)(System.nanoTime() - time)/(100000000)+" secs");
        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
