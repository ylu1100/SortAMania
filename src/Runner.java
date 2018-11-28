public class Runner{

    public static void main(String[] args){
        int[] arr1 = randomIntArray(10000);
        //System.out.println(SortCompetition.challengeOne(arr1));
    }

    public static int[] randomIntArray(int length){
        int[] output = new int[length];
        for(int i = 0; i < length; i++){
            output[i] = getRandomInteger(0,100000);
        }
        return output;
    }

    public static int getRandomInteger(int min, int max){
        return (int)(Math.random()*(max-min));
    }

}
