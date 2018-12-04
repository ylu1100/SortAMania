import C4method.challengeFourMethods;
import C4method.challengeFourMethods2;
import Challenges.Challenge5;
import Challenges.Comparable;

public class Team11SortCompetition extends SortCompetition //implements Comparable<Challenge5>
{

    public int median(int[] arr)
    {
        if(arr.length % 2 != 0)
        {
            return arr[arr.length / 2];
        }
        return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2;
    }
    @Override
    public int challengeOne(int[] arr)
    {
        InsertionSort(arr);
        return arr[arr.length/2];
    }

    @Override
    public int challengeTwo(String[] arr, String query) {


        BubbleSort(arr);
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].equals(query)) {
                return k;
            }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr)
    {
        InsertionSort(arr);
        return arr[arr.length/2];

    }

    @Override
    public int challengeFour(int[][] arr) {

        int[] medianArr = new int[arr.length];
        for (int x = 0; x < arr.length; x++) {
            int[] temp = new int[arr[x].length];
            challengeFourMethods testNo = new challengeFourMethods(arr,x);
            testNo.mergeSortHelper(arr,0,arr[x].length-1,temp,x);

            medianArr[x] = arr[x][(arr[x].length)/2];

        }
        int[] temp = new int[10000];
        challengeFourMethods2.InsertionSort(arr,medianArr,temp);

        return (medianArr[medianArr.length/2]);
    }

    @Override
    public int challengeFive(java.lang.Comparable[] arr, java.lang.Comparable query) {
        return 0;
    }

    //@Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        return 0;
    }
    public static void BubbleSort(Challenge5[] arr ) {
        Boolean swappable = true;
        Challenge5 place;
        while (swappable == true) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swapped = true;
                    place = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = place;
                }
            }
            if (!swapped) {
                swappable = false;
            }
        }
    }

    @Override
    public String greeting()
    {
        return null;
    }

    public static String letterGenerator() {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int getPlace = (int) (Math.random() * 25) + 1;
        return alpha.substring(getPlace - 1, getPlace);

    }


    public static void BubbleSort(String[] arr) {
        Boolean swappable = true;
        String place = "";
        while (swappable == true) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i+1].compareTo(arr[i]) < 0) {
                    swapped = true;
                    place = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = place;
                    }
                }
                if (!swapped) {
                    swappable = false;
                }
            }
        }
    public static void InsertionSort(int[] arr ) {

        for (int i = 1; i < arr.length;i++) {
            if (arr[i-1] > arr[i]) {
                //int min = arr[i];
                for (int j = i; j > 0;j--) {

                    if ( arr[j-1] > arr[j]) {
                        int place = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = place;
                    }
                }
            }


        }
    }
}