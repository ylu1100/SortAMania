package Challenges;

public  class Challenge5 implements Comparable<Challenge5> {
    public int value;
    public Challenge5() {
        this.value = (int)(Math.random()*10000);
    }
    public int compareTo(Challenge5 other) {
        return this.value - other.value;
    }
    public Challenge5[] randomArr(int num) {
        Challenge5[] five = new Challenge5[num];
        for (int i = 0;i < num;i++) {
            five[i] = new Challenge5();
        }
        return five;
    }
    public static void BubbleSort(Challenge5[] arr ) {
        Boolean swappable = true;
        Challenge5 place;
        while (swappable == true) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swapped = true;
                    place = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = place;
                }
            }
            if (!swapped) {
                swappable = false;
            }
        }
    }

}
