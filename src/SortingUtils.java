public class SortingUtils {
    public static int[] randomIntsArr(int count){
        int [] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static void swap(int[] testArr, int x, int y) {
        int temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }

    public static String[] randomStrArr(int count, int length)
    {
        String[] arr = new String [count];
        while(count>0)
        {
            int i = 0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            count--;
            arr[count] = s;
        }
        return arr;
    }
}
