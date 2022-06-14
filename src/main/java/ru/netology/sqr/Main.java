package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int min = 100;
        int max = 400;
        int count = service.calculate(min, max);
        System.out.println(count);
    }
}
