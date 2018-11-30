import Challenges.Team11SortCompetition;

public class Runner {
    public static int[] setUp1(int num)
    {
        int[] arr = new int[num];
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
            for (int m = 0; m < arr4[m].length; m++) {
                System.out.println(arr4[n][m]);
            }
            System.out.println("this is next nine  ");

        }
    }
    public static void main(String[] args) {
        Team11SortCompetition Team11 = new Team11SortCompetition();
        String[] array2 = setUp2(10000);
        //printArr2(array2);
        //System.out.println(Team11.challengeTwo(array2,array2[3]));
        //printArr2(array2);
        int[][] array4 = setUp4(10,10);
        printArr4(array4);
        System.out.println(Team11.challengeFour(array4));
        //printArr4(array4);

    }
}
