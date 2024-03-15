package LockAndKey;

public class Key {
    private KeyColor key;
    public Key() {
    }

    public KeyColor getKey() {
        return key;
    }

    public void setKeyRed() {
        this.key = KeyColor.RED;
    }

    public void setKeyBlue() {
        this.key = KeyColor.BLUE;
    }

    public void setKeyYellow() {
        this.key = KeyColor.YELLOW;
    }

    public void setKeyGreen() {
        this.key = KeyColor.GREEN;
    }
}
