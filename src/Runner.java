import java.util.Arrays;

public abstract class Runner extends SortCompetition {

    public static void main(String[] args){

        SortCompetition team19 = new Team19SortCompetition();
        System.out.println(team19.greeting() + "\n");

        int[] arr1 = randomIntArr(10000, 0, 10000);
        System.out.println("Unsorted: " + Arrays.toString(arr1));
        long duration = System.currentTimeMillis();
        System.out.println("Returns: " + team19.challengeOne(arr1));
        duration = System.currentTimeMillis() - duration;
        System.out.println("Sorted: " + Arrays.toString(arr1));
        System.out.println("Challenge 1 Duration: " + duration * 0.001 + " seconds \n");

        String[] arr2 = randomStrArr(1000,5);
        System.out.println("Unsorted: " + Arrays.toString(arr2));
        duration = System.currentTimeMillis();
        System.out.println("Returns: " + team19.challengeTwo(arr2,"bingo"));
        duration = System.currentTimeMillis() - duration;
        System.out.println("Sorted: " + Arrays.toString(arr2));
        System.out.println("Challenge 2 Duration: " + duration  * 0.001 + " seconds \n");

        /*int[] arr3 = ();
        System.out.println(Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        System.out.println(team19.challengeTwo(arr2,"bingo"));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println(Arrays.toString(arr2));
        System.out.println("Challenge 2 Duration: " + duration + " nanoseconds");*/

        int[][] arr4 = random3DIntArr(1000,10000);
        System.out.println(Arrays.toString(arr4[0]));
        duration = System.currentTimeMillis();
        System.out.println("Returns: " + team19.challengeFour(arr4));
        duration = System.currentTimeMillis() - duration;
        System.out.println("Challenge 4 Duration: " + duration  * 0.001 + " seconds");


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

    public static int[][] random3DIntArr(int num, int max){
        int[][] arr = new int[num][num];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = getRandomInteger(0,max);
            }
        }
        return arr;
    }

    public static int getRandomInteger(int min, int max){
        return (int)(Math.random()*(max-min));
    }

}
