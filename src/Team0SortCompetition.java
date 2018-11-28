public class Team0SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
            boolean done=false;
            while(!done)
            {
                done=true;
                for(int i=0;i<arr.length-1;i++)
                {
                    int a=arr[i];
                    int b=arr[i+1];
                    if(a>b)
                    {
                        done=false;
                        arr[i]=b;
                        arr[i+1]=a;

                    }
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
