public class Object implements Comparable{
    private int value;
    public Object(int value)
    {
        this.value = value;
    }
    @Override
    public int compareTo(Object o) {
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
