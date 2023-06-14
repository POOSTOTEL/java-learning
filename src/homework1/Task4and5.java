package homework1;

import java.util.Scanner;

public class Task4and5 {
    public static void main(String[] args) {
        //Подключение сканера для считывания данных пользователя
        Scanner scanner = new Scanner(System.in);
        //Создание переменных для хранения курса обмена RUB
        float exchangeRateYesterdayRUB = 0;
        float exchangeRateTodayRUB = 0;
        //Пользовательский ввод курсов обмена RUB
        System.out.println("Input exchange rate BYN to RUB yesterday: ");
        exchangeRateYesterdayRUB = scanner.nextFloat();
        System.out.println("Input exchange rate BYN to RUB today: ");
        exchangeRateTodayRUB = scanner.nextFloat();
        //Создание переменных для хранения курса обмена USD
        float exchangeRateYesterdayUSD = 0;
        float exchangeRateTodayUSD = 0;
        //Пользовательский ввод курсов обмена USD
        System.out.println("Input exchange rate BYN to USD yesterday: ");
        exchangeRateYesterdayUSD = scanner.nextFloat();
        System.out.println("Input exchange rate BYN to USD today: ");
        exchangeRateTodayUSD = scanner.nextFloat();
        //Создание переменной для хранения количества денег у пользователя
        float money = 0;
        //Пользовательский ввод количества денег пользователя
        System.out.println("Input amount of money: ");
        money = scanner.nextFloat();
        //Создание переменных для хранения количества денег после обменных операций
        float moneyAfterExchangeYesterdayRUB = money / exchangeRateYesterdayRUB * 100;
        float moneyAfterExchangeTodayRUB = money / exchangeRateTodayRUB * 100;
        float moneyAfterExchangeYesterdayUSD = money / exchangeRateYesterdayUSD;
        float moneyAfterExchangeTodayUSD = money / exchangeRateTodayUSD;
        //Создание ссылочных переменных строкового типа для хранения результата теренарной операции
        String outputAboutRUB = exchangeRateTodayRUB > exchangeRateYesterdayRUB ? "The exchange rate has increased" : "The exchange rate has decreased";
        String outputAboutUSD = exchangeRateTodayUSD > exchangeRateYesterdayUSD ? "The exchange rate has increased" : "The exchange rate has decreased";
        //Вывод данных связанных с обменом в RUB
        System.out.println("Exchange rate for RUB today: " + exchangeRateTodayRUB);
        System.out.println("Exchange rate for RUB yesterday: " + exchangeRateYesterdayRUB);
        System.out.println(outputAboutRUB);
        System.out.println("Today you can buy: " + moneyAfterExchangeTodayRUB + " RUB");
        System.out.println("Yesterday you could buy: " + moneyAfterExchangeYesterdayRUB + " RUB");
        System.out.print("\n");
        //Вывод данных связанных с обменом в USD
        System.out.println("Exchange rate for USD today: " + exchangeRateTodayUSD);
        System.out.println("Exchange rate for USD yesterday: " + exchangeRateYesterdayUSD);
        System.out.println(outputAboutUSD);
        System.out.println("Today you can buy: " + moneyAfterExchangeTodayUSD + " USD");
        System.out.println("Yesterday you could buy: " + moneyAfterExchangeYesterdayUSD + " USD");
    }
}
