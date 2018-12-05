public class Thing implements Comparable<Thing> {

    public int value;
    public int id;
    public Thing()
    {
        this.value = (int) (Math.random()*11);
        this.id = (int) (Math.random()*1001);
    }
    public int compareTo(Thing other)
    {
        return this.value - other.value;
    }
}
