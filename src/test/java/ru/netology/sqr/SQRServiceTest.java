package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void BoundaryConditionsTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(100, 9801);
        int expected = 90;
        assertEquals(expected, actual);
    }

    @Test
    public void LowerBoundTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(101, 9801);
        int expected = 89;
        assertEquals(expected, actual);
    }

    @Test
    public void UpperBoundTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(100, 9800);
        int expected = 89;
        assertEquals(expected, actual);
    }

    @Test
    public void TwoLowerBoundTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(10, 10);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void TwoUpperBoundTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(9801, 9801);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void MidRangeTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(400, 600);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void UnderBoundTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(0, 9);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void AboveBoundTest() {
        SQRService service = new SQRService();

        int actual = service.calcSQRT(9802, 10000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}