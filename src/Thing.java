public class Thing implements Comparable<Thing> {

    private int value;
    public Thing()
    {
        this.value = (int) (Math.random()*10001);
    }
    public int compareTo(Thing other)
    {
        return this.value - other.value;
    }
}
