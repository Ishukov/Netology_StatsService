package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void totalSales() {
        StatsService service = new StatsService();
        int expectedSum = 180;
        int actualSum = service.totalSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesInMonth() {
        StatsService service = new StatsService();
        int expectedAverage = 15;
        int actualAverage = service.averageSaleInMonth(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void monthWithMaxSales() {
        StatsService service = new StatsService();
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthWithMinSales() {
        StatsService service = new StatsService();
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void quantityMonthBelowAverage() {
        StatsService service = new StatsService();
        int expectedMonths = 5;
        int actualMonths = service.quantityMonthBelowAverage(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void quantityMonthAboveAverage() {
        StatsService service = new StatsService();
        int expectedMonths = 5;
        int actualMonths = service.quantityMonthAboveAverage(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
