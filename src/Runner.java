public class Runner
{
    public static void main(String[] args)
    {
        int[] arr= new int[10000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10000)+0;
        }
        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }

        Team0SortCompetition a1 = new Team0SortCompetition();

        long time = System.nanoTime();

        a1.challengeOne(arr);

        System.out.println("\n"+(double)(System.nanoTime() - time)/(100000000)+" secs");
        
        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
        System.out.println("\n"+a1.challengeOne(arr));


    }
}
