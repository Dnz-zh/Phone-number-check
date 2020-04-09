package com.javarush.task.task22.task2212;

import java.util.ArrayList;

/*
Проверка номера телефона
1. Метод checkTelNumber должен возвращать значение типа boolean.
2. Метод checkTelNumber должен быть публичным.
3. Метод checkTelNumber должен принимать один параметр типа String.
4. Метод checkTelNumber должен корректно проверять валидность номера телефона переданного ему в качестве параметра.
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber.isEmpty()
                || telNumber.matches(".*-{2,}.*") || telNumber.split("")[telNumber.length() - 1].matches("\\D"))
            return false;


        if (telNumber.matches("((?:\\+\\d{2})?\\(?\\d{3}\\)?\\d{3}-?\\d{2}-?\\d{2})")) return true;

        return false;
    }


    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("+380501234567");
        numbers.add("+38(050)1234567");
        numbers.add("+38050123-45-67");
        numbers.add("050123-4567");
        numbers.add("+38)050(1234567");
        numbers.add("+38(050)1-23-45-6-7");
        numbers.add("050ххх4567");
        numbers.add("050123456");
        numbers.add("(0)501234567");

        for (String num : numbers) {
            System.out.println(num + " " + checkTelNumber(num));
        }
    }
}
