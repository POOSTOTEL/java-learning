package lesson7.clinic;

public class Doctor {
    private String type;
//    private int code;// default value 0
    private Integer code;// default value null
    protected Doctor(String type, Integer code) {
        this.type = type;
        this.code = code;
    }
    public void heal() {
        System.out.println("Heal.");
    }
}
