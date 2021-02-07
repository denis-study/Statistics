package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSumSales(values);

        assertEquals(expected, actual);
    }






    @Test
    void calculateMiddleSumSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateMiddleSumSales(values);

        assertEquals(expected, actual);
    }


    @Test
    void calculateSalesMax() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.calculateSalesMax(values);

        assertEquals(expected, actual);
    }


    @Test
    void calculateSalesMin() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateSalesMin(values);

        assertEquals(expected, actual);
    }


    @Test
    void calculateMonthsLowMiddleSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateMonthsLowMiddleSales(values);

        assertEquals(expected, actual);
    }


    @Test
    void calculateMonthsUpMiddleSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateMonthsUpMiddleSales(values);

        assertEquals(expected, actual);
    }
}