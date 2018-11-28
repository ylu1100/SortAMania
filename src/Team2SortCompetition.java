public class Team2SortCompetition extends SortCompetition{

    private int[] challenge1;
    private String[] challenge2;
    private String query;
    private int[] challenge3;
    private int[][] challenge4;
    private Comparable[] challenge5;
    private Comparable cquery;

    /**
     * Data Set - an array of 10,000 random integers between 0-10000
     * Task: Sort the list and return the median
     * @param challenge1
     * @return
     */
    public int challengeOne(int[] challenge1)
    {

    }

    /**
     * Data Set - an array of 10,000 random strings (strings will be of length 5)
     * Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found
     * @param challenge2
     * @param query
     * @return
     */
    public int challengeTwo(String[] challenge2, String query)
    {

    }

    /**
     * Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
     * Task: Sort the list and return the median
     * @param challenge3
     * @return
     */
    public int challengeThree(int[] challenge3)
    {
        int n = challenge3.length;
        for(int i = 1; i < n; i++)
        {
            int key = challenge3[i];
            int j = i - 1;
            while(j >= 0 && challenge3[j] > key)
            {
                challenge3[j + 1] = challenge3[j];
                j = j - 1;
            }
            challenge3[j + 1] = key;
        }

    }

    /**
     * Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
     * Task: Sort each sub-array and then sort the arrays by their median value
     * Return the median of the median array
     * @param challenge4
     * @return
     */
    public int challengeFour(int[][] challenge4)
    {

    }

    /**
     * Data Set - an array of 10,000 objects that implement the comparable interface
     * Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
     * Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order.
     * @param challenge5
     * @param cquery
     * @return
     */
    public int challengeFive(Comparable[] challenge5, Comparable cquery)
    {

    }

    public String greeting()
    {

    }
}
