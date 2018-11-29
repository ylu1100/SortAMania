import java.util.Arrays;

public abstract class Runner extends SortCompetition {

    public static void main(String[] args){
        int[] arr1 = randomIntArr(10000, 0, 10000);
        SortCompetition x = new Team19SortCompetition();
        System.out.println(Arrays.toString(arr1));
        long startTime = System.nanoTime();
        System.out.println(x.challengeOne(arr1));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(Arrays.toString(arr1));
        System.out.println("Challenge 1 Duration: " + duration + " nanoseconds \n");

        String[] arr2 = randomStrArr(1000,5);
        System.out.println(Arrays.toString(arr2));
        startTime = System.nanoTime();
        System.out.println(x.challengeTwo(arr2,"bingo"));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(Arrays.toString(arr2));
        System.out.println("Challenge 2 Duration: " + duration + " nanoseconds");

    }

    public static int[] randomIntArr(int length, int min, int max){
        int[] output = new int[length];
        for(int i = 0; i < length; i++){
            output[i] = getRandomInteger(min,max);
        }
        return output;
    }

    public static String[] randomStrArr(int num, int length){
        String[] arr = new String[num];
        while(num > 0){
            int i = 0;
            String s = "";
            while (i < length){
                char c = (char)((Math.random()*26) + 65);
                s += c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static int getRandomInteger(int min, int max){
        return (int)(Math.random()*(max-min));
    }

}
