//Brandon Smith and Jackie Fang 12.4.18

public class Things implements Comparable<Things>{
    public int value;

    public Things()
    {
        this.value = (int)(Math.random()*10000);
    }

    @Override
    public int compareTo(Things x) {
        return this.value - x.value;
    }

}
