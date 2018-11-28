public class Team1SortCompetition extends SortCompetition {
    /**
     * 10000 random ints btwn 0-10000
     * @param arr
     * @return median
     */
    public int challengeOne (int[] arr){
        return -1;
    }

    /**
     * 10000 5 letter Strings
     * @param arr
     * @param query
     * @return 1st occurence of query or -1 if not found
     */
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

    /**
     * Mostly sorted 100000 length array
     * @param arr
     * @return median
     */
    public int challengeThree (int[] arr){
        return -1;
    }

    /**
     * 1000 int[]s sorted by their median
     * @param arr
     * @return the median of the int[][]
     */
    public int challengeFour (int[][] arr){
        return -1;
    }

    /**
     * sort array using compareTo and see if it contains the query
     * @param arr
     * @param query
     * @return return position or -1 if not found. MUST USE STABLE SORTING METHOD
     */
    public int challengeFive (Comparable[] arr, Comparable query){
        return -1;
    }

    public String greeting(){
        return "Hello.";
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
