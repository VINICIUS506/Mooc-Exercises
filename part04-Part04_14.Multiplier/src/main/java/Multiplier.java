public class Multiplier {
    private int value;

    public Multiplier(int number) {
        this.value = number;
    }

    // Should multiply number parameter by the number provided to the constructor
    public int multiply(int number) {
        return number * this.value;
    }
}
