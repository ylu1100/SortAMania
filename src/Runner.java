import java.util.Arrays;

public abstract class Runner extends SortCompetition {

    public static void main(String[] args){
        int[] arr1 = randomIntArray(10000, 0, 10000);
        System.out.println(Arrays.toString(arr1));
        long startTime = System.nanoTime();
        //System.out.println(SortCompetition.challengeOne(arr1));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(Arrays.toString(arr1));
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
