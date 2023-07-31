package homework14.enumWithCloseSizes;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    final private int BABY_SIZE = 32;
    private int euroSize;
    private String description = "Взрослый размер";

    Size(int euroSize) {
        this.euroSize = euroSize;
        if (this.euroSize < BABY_SIZE) {
            this.description = "Детский размер";
        }
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return description;
    }
}
