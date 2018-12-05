public abstract class Thing implements Comparable<Thing> {
    private int val;

    public Thing()
    {
        this.val = ((int)(Math.random()*100000));
    }

    public int compareTo(Thing thing)
    {
        if (this.getVal() > thing.getVal())
        {
            return -1;
        } else if ( this.getVal() < thing.getVal())
        {
            return 1;
        } else
        {
            return 0;
        }
    }

    public int getVal() {
        return val;
    }
}
