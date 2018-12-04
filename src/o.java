public class o implements Comparable<o>{
    private int a;
    public o()
    {
        a = (int) Math.floor(Math.random() * (1000 - 1 + 1)) + 1;
    }
    @Override
    public int compareTo(o other) {
        return this.a - other.getValue();
    }
    public int getValue()
    {
        return this.a;
    }
}
