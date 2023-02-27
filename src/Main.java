public class Main {
    public static void main(String[] args) {
        lastYear(123);
        printVersion(2022,2022);
        System.out.println(howMuchDeliveryDaysNeed(65) + " дня");

    }
    public static void lastYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println();
    }
    public static void printVersion(int os, int year) {
        System.out.println("Задача 2");
        int currentYear = 2022;
        if (currentYear == year && os == 1) {
            System.out.println(" Установите обычную версию для Андроид");
        } else if (currentYear > year && os == 1) {
            System.out.println(" Установите облегченную версию для Андроид");
        } else if (currentYear == year && os == 0) {
            System.out.println(" Установите обычную версию для IOS");
        } else {
            System.out.println(" Установите облегченную версию для IOS");
        }
        System.out.println();
    }
    private static int howMuchDeliveryDaysNeed(int deliveryDistance) {
        System.out.println("Задача 3");
        int deliveryDay = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay++;
        } else if (deliveryDistance > 100) {
            return  - 1;
        }
        return deliveryDay;
    }


}