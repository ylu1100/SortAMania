package C4method;

public class challengeFourMethods2 {
    public static void merge(int[][] arr,int index,int[] med) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp, index,med);
    }
    public static void mergeSortHelper(int[][] arr,int left,int right, int[] temp,int index,int[] med) {
        if (left < right) {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp,index,med);
            mergeSortHelper(arr,mid+1,right,temp,index,med);
            merge(arr,left,mid,right,temp,index,med);
        }
    }

    public static void merge(int[][] arr,int left,int mid,int right,int[] temp,int index,int[] med) {
        int i = left;
        int j = mid +1;
        int k = left;
        while (i <=mid && j<=right) {
            if (med[i] <= med[j]) {
                temp[k] = arr[index][i];
                i++;
            }
            else {
                temp[k]= arr[index][j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k] = arr[index][i];
            i++;
            k++;
        }
        while(j<=right) {
            temp[k] = arr[index][j];
            j++;
            k++;
        }
        for (int m = left; m <right; m++) {
            arr[index][m] = temp[m];
        }
        System.out.println("This is the new Arr:");
        for (int n = 0; n <arr.length; n++) {

            System.out.println(arr[n]);
        }


    }
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
                        arr[j - 1] = arr[j];
                        for(int n = 0;n < temp.length;n++) {
                            arr[j][n] = temp[n];
                        }
                    }
                    }
                }
            }


        }
}
