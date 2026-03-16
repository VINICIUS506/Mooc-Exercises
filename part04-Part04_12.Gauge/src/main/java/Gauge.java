public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    // Grows the value instance by one:
    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    // Decreases the vlaue instance by one:
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    // Returns the instance value:
    public int value() {
        return value;
    }

    public boolean full() {
        if (value == 5) {
            return true;
        }

        return false;
    }
}
