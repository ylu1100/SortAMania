public class Thingy {
    private int value;

    public void randomThingArr() {
        Thingy[] things = new Thingy[1000];
        for (int i = 0; i < 1000; i++) {
            things[i] = new Thingy();
        }
    }

    public Thingy() {
        this.value = (int) (Math.random() * 10000);
    }


    public int compareTo(Thingy other)
    {
        return this.value - other.value;
    }

}

