public class Song {
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // Returns the name of the song:
    public String name() {
        return this.name;
    }

    // Returns the length of the song:
    public int length() {
        return this.length;
    }
}
