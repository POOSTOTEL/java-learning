package homework10.exhibition;

public class ElectricPhoto extends Photo {
    String eName;
    String extension;
    double size;

    public ElectricPhoto(String type, String eName, String extension, double size) {
        super(type);
        this.eName = eName;
        this.extension = extension;
        this.size = size;
    }
}
