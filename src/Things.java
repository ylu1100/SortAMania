public class Things implements Comparable<Things>{
    private int value;

    public Things(int value)
    {
        this.value =(int)(Math.random()*10000);
    }

    @Override
    public int compareTo(Things x) {
        return this.value - x.value;
    }
}
