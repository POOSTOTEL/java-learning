package homework10.exhibition;

public class PhysicalPhoto extends Photo {
    String material;
    Paper paper;

    public PhysicalPhoto(String type, String material) {
        super(type);
        this.material = material;
    }
}
