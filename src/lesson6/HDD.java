package lesson6;

public class HDD {
    String name;
    double size;
    boolean internal;
    public HDD () {
        name = "ERROR";
        size = 0.0;
        internal = false;
    }
    public HDD (String name, double size, boolean internal) {
        this.name = name;
        this.size = size;
        this.internal = internal;
    }
}
