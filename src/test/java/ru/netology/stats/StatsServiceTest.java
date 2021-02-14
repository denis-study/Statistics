package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void shouldSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sum(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        assertEquals(15, service.avg(sales));
    }


    @Test
    void shouldReturnWithMax() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        assertEquals(8, service.monthWithMax(sales));
    }


    @Test
    void shouldReturnWithMin() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        assertEquals(9, service.monthWithMin(sales));
    }
}

