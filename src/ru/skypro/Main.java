package ru.skypro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // задача 1
        int clientOs = 0;
        int clientAndroid = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения iOs по ссылке");
        } else {
            System.out.println("Установите версию приложения Android по ссылке");
        }

        // задача 2
        int clientDeviceYear = 2010;// выбрать год
        int clientOs2 = 0;// выбрать ОС для iOs
        int clientAndroid2 = 1;// выбрать ОС для Android

        if (clientDeviceYear >= 2015 && clientOs2 == 0 && clientAndroid2 == 1) {
            System.out.println("Установите версию приложения iOs по ссылке");
            System.out.println("Установите версию приложения Android по ссылке");
        } else if (clientOs2 == 0 && clientAndroid2 == 1) {
            System.out.println("Установите облегченную версию приложения iOs по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        // задача 3
        int year = 1624;

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


        // задача 4

        int time20 = 1;// время (дней) доставки в радиусе 20 км
        int time60 = 2;// время (дней) доставки в радиусе 60 км
        int time100 = 3;// время доставки в радиусе 100 км
        int deliveryDistance = 65;// расстояние до клиента

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + time20 + " доставки.");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней: " + time60 + " доставки.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + time100 + " доставки.");
        }


        //задача 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц Зимы");
                break;
            case 2:
                System.out.println(monthNumber + " месяц Зимы");
                break;
            case 3:
                System.out.println(monthNumber + " месяц Весны");
                break;
            case 4:
                System.out.println(monthNumber + " месяц Весны");
                break;
            case 5:
                System.out.println(monthNumber + " месяц Весны");
                break;
            case 6:
                System.out.println(monthNumber + " месяц Лета");
                break;
            case 7:
                System.out.println(monthNumber + " месяц Лета");
                break;
            case 8:
                System.out.println(monthNumber + " месяц Лета");
                break;
            case 9:
                System.out.println(monthNumber + " месяц Осени");
                break;
            case 10:
                System.out.println(monthNumber + " месяц Осени");
                break;
            case 11:
                System.out.println(monthNumber + " месяц Осени");
                break;
            case 12:
                System.out.println(monthNumber + " месяц Зимы");
                break;
            default:
                System.out.println("Такого месяца нет в году.");
                break;
        }














    }
}












