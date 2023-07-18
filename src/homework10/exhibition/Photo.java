package homework10.exhibition;

public class Photo {
    public Photo(String type) {
        switch (type.toLowerCase()) {
            case "physical" -> PhysicalPhoto();
            case "electric" -> ElectricPhoto();
        }
    }
}
