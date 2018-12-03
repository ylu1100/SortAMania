import Challenges.Team11SortCompetition;

import java.util.Scanner;

public class Runner {
    public static int[] setUp1(int num)
    {
        int[] array3 = new int[num];
        for (int j = 0; j < num; j++) {

            array3[j] = (int) (Math.random() * 10000) + 1;;

        }
        return array3;
    }
    public static void printArr1(int[] arr3) {
        System.out.println("This is the new Arr:");
        for (int n = 0; n < arr3.length; n++) {

            System.out.println(arr3[n]);
        }
    }
    public static String[] setUp2(int num){
        String[] array2 = new String[num];
        for (int j = 0; j < array2.length; j++) {
            String value = "";
            value += Team11SortCompetition.letterGenerator();
            value += Team11SortCompetition.letterGenerator();
            value += Team11SortCompetition.letterGenerator();
            value += Team11SortCompetition.letterGenerator();
            value += Team11SortCompetition.letterGenerator();
            array2[j] = value;

        }
        return array2;
    }
    public static int[] setUp3(int num){
        int[] array3 = new int[num];
        for (int j = 0; j < num; j++) {

            array3[j] = (int) (Math.random() * 100000) + 1;;

        }
        return array3;
    }

    public static void printArr3(int[] arr3) {
        System.out.println("This is the new Arr:");
        for (int n = 0; n < arr3.length; n++) {

            System.out.println(arr3[n]);
        }
    }
    public static int[][] setUp4(int num1,int num2) {
        int [][] arr = new int[num1][num2];
        for (int i = 0; i < num1;i++) {
            for (int j = 0;j< num2; j++) {
                arr[i][j] =  (int) ((Math.random() * 10000) + 1);
            }
        }
        return arr;
    }
    public static void printArr2(String[] arr2) {
        System.out.println("This is the new Arr:");
        for (int n = 0; n < arr2.length; n++) {

            System.out.println(arr2[n]);
        }
    }
    public static void printArr4(int[][] arr4) {
        System.out.println("This is the new Arr:");
        for (int n = 0; n < arr4.length; n++) {
            for (int m = 0; m < arr4[n].length; m++) {
                System.out.println(arr4[n][m]);
            }
            System.out.println("this is next nine  ");

        }
    }
    public static void runChallenge1() {
        Team11SortCompetition Team11 = new Team11SortCompetition();
        int[] array1 = setUp3(10000);
        //printArr3(array3);
        System.out.println("the median is" + Team11.challengeOne(array1));
        printArr3(array1);
    }
    public static void runChallenge2() {
        Team11SortCompetition Team11 = new Team11SortCompetition();
        String[] array2 = setUp2(10000);
        //printArr2(array2);
        System.out.println("the median is" + Team11.challengeTwo(array2,array2[3]));
        printArr2(array2);
    }
    public static void runChallenge3() {
        Team11SortCompetition Team11 = new Team11SortCompetition();
        int[] array1 = setUp3(100000);
        //printArr3(array3);
        System.out.println("the median is" + Team11.challengeOne(array1));
        printArr3(array1);
    }
    public static void runChallenge4() {
        Team11SortCompetition Team11 = new Team11SortCompetition();
        int[][] array4 = setUp4(10000,10000);
        // printArr4(array4);
        System.out.println("the median is" + Team11.challengeFour(array4));
        printArr4(array4);
    }

    public static void main(String[] args) {

        Scanner Greeting = new Scanner (System.in);
        System.out.println("Good morning Brooklyn Tech, WHat challenge should I present?");
        System.out.println("(Type the number of the challenge, ex: type 1 for challenge 1)");
        String response = Greeting.nextLine();
        if (response.equals("1")) {
            runChallenge1();
        }
        else if (response.equals("2")) {
            runChallenge2();
        }
        else if (response.equals("3")) {
            runChallenge3();
        }
        else if (response.equals("4")) {
            runChallenge4();
        }



    }
}
