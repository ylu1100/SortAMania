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

}
