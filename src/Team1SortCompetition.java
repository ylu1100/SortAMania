public class Team1SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return getMedian(arr);
    }

    public int challengeTwo (String[] arr, String query){
        mergeSort(arr);
        int index = 0;

            for(int i=0;i<arr.length;i++)
            {
                if(query.substring(index,index+1).equals(arr[i].substring(index,index+1)))
                {

                    index++;
                    if(query.substring(index,index+1).equals(arr[i].substring(index,index+1)))
                    {

                        index++;
                        if(query.substring(index,index+1).equals(arr[i].substring(index,index+1)))
                        {

                            index++;
                            if(query.substring(index,index+1).equals(arr[i].substring(index,index+1)))
                            {

                                return i;
                            }
                        }
                    }
                }
                index = 0;
            }
        return -1;
    }

    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return getMedian(arr);
    }

    public int challengeFour(int[][] arr) {
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            quickSort(arr[i],0,arr[i].length-1);
            temp[i] = getMedian(arr[i]);
        }
        quickSort(temp,0,temp.length-1);
        return getMedian(temp);
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return -1;
    }

    public String greeting() {
        return "Hello.";
    }

    public int getMedian(int[] arr){
        if((int)(arr.length/2.0)+1%2==0){
            return (arr[(arr.length/2)-1] + arr[arr.length/2])/2;
        } else {
            return arr[(arr.length/2)];
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void mergeSort(String[] arr)
    {
        int n= arr.length;
        String[] temp = new String[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    public static void mergeSortHelper(String[] arr,int left,int right, String[] temp)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(String[] arr,int left,int mid,int right,String[] temp)
    {
        int i=left;
        int j=mid+1;
        int k=left;
        while(i<=mid && j<=right){
            if(arr[i].compareTo(arr[j])<0)
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            temp[k]  =arr[j] ;
            j++;
            k++;
        }
        for(int z=left;z<=right;z++)
        {
            arr[z] = temp[z];
        }

    }
    public static void insertionSort(int[] list1)
    {
        int[] list1Copy = new int[list1.length];

        for(int i=0;i<list1.length;i++) {
            int check = 0;
            check++;
            list1Copy[i] = list1[i];
            if (i != 0) {
                int pos = i;
                while (check > 0) {
                    if(pos > 0) {
                        if (list1[pos - check] > list1[pos]) {
                            swap(list1, (pos - check), pos);
                            pos--;
                        } else {
                            check = 0;
                        }
                    }
                    if(pos == 0)
                    {
                        check =0;
                    }
                }
            }
        }

    }
}
