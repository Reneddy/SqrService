package ru.netology.sqr;

public class SQRService {
    public int calcSQRT(int min, int max) {
        int sqrNumber = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrt = i * i;
            if (sqrt >= min) if (sqrt <= max) {
                sqrNumber++;
            }
        }
        return sqrNumber;
    }
}
