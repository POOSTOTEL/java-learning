package lesson12;

public class SeasonsRunner {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }

    private static void printFavoriteSeason(Season season) {
        String seasonStr = null;
        switch (season) {
            case WINTER -> seasonStr = "зиму";
            case SPRING -> seasonStr = "весна";
            case SIMMER -> seasonStr = "лето";
            case AUTUMN -> seasonStr = "осень";
            default -> {
                return;
            }
        }

    }
}
