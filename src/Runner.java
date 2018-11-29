import java.util.Arrays;

public abstract class Runner extends SortCompetition {

    public static void main(String[] args){
        int[] arr1 = randomIntArray(10000, 0, 10000);
        SortCompetition x = new Team19SortCompetition();
        System.out.println(Arrays.toString(arr1));
        long startTime = System.nanoTime();
        System.out.println(x.challengeOne(arr1));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(Arrays.toString(arr1));
        System.out.println("Challenge 1 Duration: " + duration + " nanoseconds");

        //String[] arr2 = randomStrArray(1000,5);
    }

    public static int[] randomIntArray(int length, int min, int max){
        int[] output = new int[length];
        for(int i = 0; i < length; i++){
            output[i] = getRandomInteger(min,max);
        }
        return output;
    }

    public static int getRandomInteger(int min, int max){
        return (int)(Math.random()*(max-min));
    }

}
