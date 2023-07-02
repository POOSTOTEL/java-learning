package homework7.sellary;

public class SalaryCalculator {
    public static void calculate(Student[] arr) {
        int summaryMoney = 0;
        for (Student student : arr) {
            summaryMoney += student.scholarship();
        }
        System.out.println("Summary scholarship: " + summaryMoney);
    }
}
