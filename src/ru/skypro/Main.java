package ru.skypro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // задача 1
        int clientAndroid = 1;
        int clientOs = 0;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения iOs по ссылке");
        } else {
            System.out.println("Установите версию приложения Android по ссылке");
        }


        // задача 2
        int clientDeviceYear = 2010;
        int clientOsAny = 0;
        int clientAndroidAny = 1;

        if (clientDeviceYear >= 2015 && clientOsAny == 0 && clientAndroidAny == 1) {
            System.out.println("Установите версию приложения iOs по ссылке");
            System.out.println("Установите версию приложения Android по ссылке");
        } else if (clientOsAny == 0 && clientAndroidAny == 1) {
            System.out.println("Установите облегченную версию приложения iOs по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        // задача 3
        int year = 2005;

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


        // задача 4
        int deliveryTime = 1;// время (дней) доставки в радиусе 20 км
        int deliveryDistance = 30;// расстояние до клиента

        if (deliveryDistance > 20) {
            deliveryTime ++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime ++;
        }
        System.out.println("Потребуется: " + deliveryTime + " день доставки.");


        //задача 5
        int monthNumber = 9;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц Зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц Весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц Лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц Осени");
                break;
        }
    }
}












