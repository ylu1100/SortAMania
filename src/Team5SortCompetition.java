import java.util.Arrays;



public class Team5SortCompetition extends SortCompetition{
    @Override
    public int challengeOne(int[] arr) {
        int[]newarray=new int [arr.length];
        for(int i = 0;i<arr.length;i++){
            newarray[i]=arr[i];
        }
        SortingUtils.insertionSort(newarray);
        if(arr.length%2==1){
            return arr[(arr.length/2)+1];
        }
        else
        {
            return (arr[(arr.length/2)]+arr[(arr.length/2)+1])/2;
        }
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        String[]newarray = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            newarray[i]=arr[i];
        }
        SortingUtils.insertionSort(newarray);
        if(Arrays.binarySearch(arr,query)<0){
            return -1;
        }
        else {
            return Arrays.binarySearch(arr,query);
        }
    }

    @Override
    public int challengeThree(int[] arr) {
        int[]newarray=new int [arr.length/2];
        int[]newarray2=new int[arr.length-newarray.length];
        int[]combnewarray=new int[arr.length];
        for(int i = 0;i<arr.length/2;i++){
            newarray[i]=arr[i];
        }
        for(int x = arr.length/2;x<arr.length;x++){
            newarray2[x]=arr[x];
        }
        SortingUtils.insertionSort(newarray);
        SortingUtils.insertionSort(newarray2);
        
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
}
