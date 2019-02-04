
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
    public static int minIndex(int arr[],int ind){
        int index = ind;
        for(int i = index+1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }
    public static void selectionSort(int[] list1) {
        for (int i = 0; i < list1.length; i++) {
           swap(list1,i,minIndex(list1,i));
        }
    }
    
}
 public static void insertionSort(int[]list1){

        for(int i = 1;i<list1.length;i++){

            for(int j = i;j>0;j--){

                if(list1[j-1]>list1[j]){

                    swap(list1,j-1,j);

                }

                else{

                    j=0;

                }

            }

        }

    }

}

