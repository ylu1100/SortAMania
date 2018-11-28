public class Team0SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        public static void bubbleSort(String[] list1)
        {
            String temp;
            int swaps = 0;
            boolean swapped = true;
            while(swapped) {
                for (int i = 0; i < list1.length - 1; i++) {
                    if (list1[i].compareTo(list1[i + 1]) > 0) {
                        temp = list1[i];
                        list1[i] = list1[i + 1];
                        list1[i + 1] = temp;
                        swaps++;
                    }
                }
                if(swaps > 0)
                {
                    swaps = 0;
                }
                else
                {
                    if(swaps == 0)
                        swapped = false;
                }
            }
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
