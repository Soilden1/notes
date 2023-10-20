package dimacm14.domain;

public class Note {

    private final String username;
    private final String text;

    public Note(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String username() {
        return username;
    }

    @Override
    public String toString() {
        return text;
    }
}
