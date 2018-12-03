public class Thing implements Comparable{
    private int value;
    public Thing(int value)
    {
        this.value = value;
    }
    @Override
    public int compareTo(Thing o) {
        return value - o.getValue();
    }
    public int getValue()
    {
        return this.value;
    }
    public boolean equalsTo(Comparable o)
    {
        return true;
    }
}
