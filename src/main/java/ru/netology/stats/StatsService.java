package ru.netology.stats;

public class StatsService {
    // Сумма продаж
    public int totalSales(long[] sales) {
        int sumsales = 0;
        for (long sale : sales) {
            sumsales = Math.toIntExact(sumsales + sale);
        }
        return sumsales;
    }

    // Средняя сумма продаж за месяц
    public int averageSaleInMonth(long[] sales) {
        int sumsales = 0;
        for (long sale : sales) {
            sumsales = Math.toIntExact(sumsales + sale);
        }
        return sumsales / sales.length;
    }

    //Месяц с максимальной суммой продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Месяц с минимальной суммой продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Кол-во месяцев с продажами ниже среднего
    public int quantityMonthBelowAverage(long[] sales) {
        int sumsales = 0;
        int average = 0;
        int months = 0;
        for (long sale : sales) {
            sumsales = Math.toIntExact(sumsales + sale);
        }
        average = sumsales / sales.length;
        for (long sale : sales) {
            if (sale < average) {
                months = months + 1;
            }
        }
        return months;
    }

    //Кол-во месяцев с продажами выше среднего
    public int quantityMonthAboveAverage(long[] sales) {
        int sumsales = 0;
        int average = 0;
        int months = 0;
        for (long sale : sales) {
            sumsales = Math.toIntExact(sumsales + sale);
        }
        average = sumsales / sales.length;
        for (long sale : sales) {
            if (sale > average) {
                months = months + 1;
            }
        }
        return months;
    }

}
