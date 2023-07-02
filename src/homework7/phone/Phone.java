package homework7.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;
    public Phone (String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone () {
    }
    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall (String name, String phoneNumber) {
        System.out.println("Звонит " + name + ", с номером " + phoneNumber);
    }
    public String getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }
    public String getModel() {
        return model;
    }

    public void sendMessage (String ... numbers){
        System.out.println("На эти номера будет отправлено сообщение:");
        for (String number: numbers) {
            System.out.println(number);
        }
    }
    public void print (){
        System.out.println("Info about this phone:");
        System.out.println("Number: " + this.getNumber());
        System.out.println("Model: " + this.getModel());
        System.out.println("Weight: " + this.getWeight());
        System.out.println();
    }
}
