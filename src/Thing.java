//Alexander Cox
//December 3, 2018

public class Thing implements java.lang.Comparable<Thing>
{
    public int index;

    public Thing (int index)
    {
        this.index = index;
    }

    public int compareTo(Thing otherObj)
    {
        return (this.index - otherObj.index);
    }

    public String toString()
    {
        return Integer.toString(this.index);
    }
}