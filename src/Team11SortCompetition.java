public class Team11SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {

        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {

        for (int j = 0; j < arr.length;j++) {
            String value = "";
            value += letterGenerator();
            value += letterGenerator();
            value += letterGenerator();
            value += letterGenerator();
            value += letterGenerator();
            arr[j] = value;
        }
        merge(arr);
        
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
    public String letterGenerator() {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int getPlace = (int)(Math.random() * 25) + 1;
        return alpha.substring(getPlace-1,getPlace);

    }
    public static void merge(String[] arr) {
        int n = arr.length;
        String[] temp = new String[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    public static void mergeSortHelper(String[] arr,int left,int right, String[] temp) {
        if (left < right) {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(String[] arr,int left,int mid,int right,String[] temp) {
        int i = left;
        int j = mid +1;
        int k = left;
        while (i <=mid && j<=right) {
            if (arr[i].compareTo(arr[j]) == -1) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int m = left; m <right; m++) {
            arr[m] = temp[m];
        }
        System.out.println("This is the new Arr:");
        for (int n = 0; n <arr.length; n++) {

            System.out.println(arr[n]);
        }

    }
}
