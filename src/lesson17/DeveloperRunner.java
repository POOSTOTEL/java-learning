package lesson17;

import java.util.List;
import java.util.Optional;

public class DeveloperRunner {
    public static void main(String[] args) {
        var developer1 = new Developer(1, "Ilon");
        var developer2 = new Developer(22, "Mark");
        var developer3 = new Developer(3, "Steave");
        var developer4 = new Developer(41, "Anna");
        var developerList = List.of(developer1, developer2, developer3, developer4);
        Optional<Developer> devOp = developerList.stream().filter(developer -> developer.getId() > 10 && developer.getName().startsWith("An")).findAny();
        devOp.ifPresent(developer -> System.out.printf("Кандидат найден %s", developer.getName()));
        devOp.orElseThrow(() -> new RuntimeException("Кандидат не найден."));
    }
}
