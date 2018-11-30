package Challenges;

import C4method.challengeFourMethods;
import C4method.challengeFourMethods2;

public class Team11SortCompetition extends SortCompetition {



    @Override
    public int challengeOne(int[] arr) {

        return 0;
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
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {

        int[] medianArr = new int[arr.length];
        for (int x = 0; x < arr.length; x++) {
            challengeFourMethods.merge(arr,x);
            medianArr[x] = arr[x][(arr[x].length)/2];

        }
        int[] temp = new int[10000];
        challengeFourMethods2.InsertionSort(arr,medianArr,temp);

        return (medianArr[medianArr.length/2]);
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
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


}