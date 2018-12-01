package C4method;

public class challengeFourMethods2 {

    public static void InsertionSort(int[][] arr,int[] med,int[] temp ) {

        for (int i = 1; i < arr.length;i++) {
            if (med[i-1] > med[i]) {
                //int min = arr[i];
                for (int j = i; j > 0;j--) {

                    if ( med[j-1] > med[j]) {
                        for(int m = 0;m < arr[j-1].length;m++) {
                            temp[m] = arr[j-1][m];
                        }
                        //int place = arr[j - 1];
                        //arr[j - 1] = arr[j];
                        for(int k = 0;k < arr[j-1].length;k++) {
                            arr[j-1][k] = arr[j][k];
                        }
                        for(int n = 0;n < temp.length;n++) {
                            arr[j][n] = temp[n];
                        }
                    }
                    }
                }
            }


        }
}
    /*/public static void InsertionSort(int[] arr ) {

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
            }/*/



