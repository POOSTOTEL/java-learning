package homework7.phone;

public class PhoneBook {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+375444765694", "Nokia");
        Phone phone3 = new Phone("+375293390537", "Samsung", 215.8);
        phone1.print();
        phone2.print();
        phone3.print();
        phone1.receiveCall("Ignat");
        phone2.receiveCall("Polina");
        phone3.receiveCall("Inga");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone2.receiveCall("Irina", "+375298081243");
        phone1.sendMessage("+375442965117", "+375336027881", "+375298921304");
    }
}
