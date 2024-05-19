import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Task 2");

        int year = 2015;
        int clientOS2 = 1;
        int clientDeviceYear = 2024;
        if (clientOS2 == 0 && clientDeviceYear < year) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= year) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < year) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= year) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Task 3");

        int year2 = 2021;
        if (year2 >= 1584 && (year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0)) {
            System.out.println("Высокосный год");
        } else {
            System.out.println("Не высокосный год");
        }

        System.out.println("Task 4");

        int deliveryDistance = 10;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println(" Потребуеться дней доставка " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays++;
            System.out.println(" Потребуется дней " + deliveryDays);
        } else if (deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println(" Потребуеться дней " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Task 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
                System.out.println("Это зима");
                break;
            case 1:
                System.out.println("Это зима");
                break;
            case 2:
                System.out.println("Это зима");
                break;
            case 3:
                System.out.printf("Это весна");
                break;
            case 4:
                System.out.printf("Это весна");
                break;
            case 5:
                System.out.printf("Это весна");
                break;
            case 6:
                System.out.printf("Это лето");
                break;
            case 7:
                System.out.printf("Это лето");
                break;
            case 8:
                System.out.printf("Это лето");
                break;
            case 9:
                System.out.printf("Это осень");
                break;
            case 10:
                System.out.printf("Это осень");
                break;
            case 11:
                System.out.printf("Это осень");
                break;
            default:
                System.out.printf("Нет такого месяца");
        }
    }
}
