// Afaq Anwar

/**
 * General Comparable Object.
 */
public class Thing implements Comparable<Thing> {
    // Arbitrary Field.
    private int value;

    /**
     * Main Constructor.
     */
    public Thing() {
        value = (int)(Math.random() * 10000);
    }

    /**
     * Alternative Constructor.
     * @param value Integer representing the value of Thing.
     */
    public Thing(int value) {
        this.value = value;
    }

    /**
     * @return Integer Representing Thing value.
     */
    public int getValue() { return this.value; }

    /**
     * Compares a Thing to another Thing based on the value.
     * @param other Any Thing object.
     * @return Integer based on the value. (> --> +) (< --> -) (= --> 0)
     */
    @Override
    public int compareTo(Thing other) {
        return this.value - other.getValue();
    }
}
