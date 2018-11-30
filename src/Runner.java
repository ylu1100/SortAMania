// Afaq Anwar

/**
 * Tests for Methods Go Here.
 * REMOVE BEFORE SUBMISSION!
 */
public class Runner {
    public static void main(String[] args) {
    }

    /**
     * Generates a random Integer array from 0 - 10,000.
     * @param count Integer representing the length of the array.
     * @return 1D Integer Array.
     */
    public static int[] randomIntArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
        return arr;
    }

    /**
     * Generates a random Double array from  0 - 10,000.
     * @param count Integer representing the length of the array.
     * @return 1D Double Array.
     */
    public static double[] randomDoubleArray(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 100);
        }
        return arr;
    }

    /**
     * Generates a random String array with Strings of a certain length.
     * Upper & Lowercase letters.
     * @param count Integer representing the length of the array.
     * @param strLength Integer representing the length of each String inside of the Array.
     * @return 1D String Array.
     */
    public static String[] randomStringArray(int count, int strLength) {
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            int wordLength = strLength;
            String word = "";
            for (int x = 0; x < wordLength; x++) {
                int randomChoice = (int)((Math.random() * 100) + 1);
                char ch;
                if (randomChoice > 50) {
                    ch = (char) ((int) ((Math.random() * 26) + 65));
                } else {
                    ch = (char) ((int) ((Math.random() * 26) + 97));
                }
                word+= ch;
            }
            arr[i] = word;
        }
        return arr;
    }
}
