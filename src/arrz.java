public class arrz implements Comparable<arrz> {

    private String str;
    private int x;

    public arrz(String s)
    {
        this.str =s;
    }
    public arrz(int a)
    {
        this.x = a;

    }
    public int compareTo(arrz o) {
        return this.str.compareTo(o.str);
    }
    public String toString()
    {

        return str;
    }
}
