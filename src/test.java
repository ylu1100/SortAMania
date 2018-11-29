public class test implements Comparable<test> {


    private String str;
    private int x;

    public test(String s)
    {
        this.str = s;
    }
    public test(int a)
    {
        this.x = a;
    }

    public int compareTo(test o) {
        return this.str.compareTo(o.str);
    }
    public String toString()
    {

        return str;
    }


}
