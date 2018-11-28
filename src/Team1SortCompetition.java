public class Team1SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        if((arr.length/2)%2==0){
            return arr[(arr.length/2)-1];
        } else {
            return (arr[(arr.length/2)-1] + arr[arr.length/2])/2;
        }
    }

    public int challengeTwo (String[] arr, String query){
        mergeSort(arr);
        int index = 0;
        while(query.substring(0,1)!= arr[index].substring(0,1))
        {
            if(query.substring(0,1).compareTo(arr[index].substring(0,1))>0)
            {
                return -1;
            }
            while(query.substring(1,2)!= arr[index].substring(1,2))
            {

                while(query.substring(2,3)!= arr[index].substring(2,3))
                {

                    while(query.substring(3,4)!= arr[index].substring(3,4))
                    {

                        while(query.substring(4,5)!= arr[index].substring(4,5))
                        {

                            if(query.substring(5,6)== arr[index].substring(5,6))
                            {
                                return index;
                            }
                        }
                    }
                }
            }

            index++;
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        return -1;
    }

    public int challengeFour(int[][] arr) {
        return -1;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return -1;
    }

    public String greeting() {
        return "Hello.";
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
}
