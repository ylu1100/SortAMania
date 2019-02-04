

public class Team5SortCompetition extends SortCompetition{
    @Override
    public int challengeOne(int[] arr) {
        int[]newarray=new int [arr.length];
        for(int i = 0;i<arr.length;i++){
            newarray[i]=arr[i];
            SortingUtils.selectionSort(newarray);
            return ((newarray[5000]+newarray[5001])/2);
        }
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
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
}
