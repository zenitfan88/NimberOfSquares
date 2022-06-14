package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = (int) Math.pow (i,2);
            if ((x > min) & (x < max)) {
                count++;
            }
        }
        return count;
    }
}

