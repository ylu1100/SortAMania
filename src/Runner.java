import java.util.Arrays;

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



        System.out.println();


        int[] arr2= new int[100000];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=(int)(Math.random()*10000)+0;
        }
        Arrays.sort(arr2);
        for(int i=0;i<200;i++)
        {
            arr2[i]=(int)(Math.random()*10000)+0;
        }
        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr2.length;i++) { System.out.print(arr2[i]+" "); }

        Team0SortCompetition a2 = new Team0SortCompetition();

        long time2 = System.nanoTime();

        a2.challengeThree(arr2);

        System.out.println("\n"+(double)(System.nanoTime() - time2)/(100000000)+" secs");

        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr2.length;i++) { System.out.print(arr2[i]+" "); }
        System.out.println("\n"+a2.challengeThree(arr2));
    }
}
