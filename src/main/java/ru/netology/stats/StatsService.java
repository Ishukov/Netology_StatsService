package ru.netology.stats;

public class StatsService {
    // Сумма продаж
    public int totalSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    // Средняя сумма продаж за месяц
    public int averageSaleInMonth(int[] sales) {
        int sum = totalSales(sales);
        return sum / sales.length;
    }

    //Месяц с максимальной суммой продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
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
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
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
    public int quantityMonthBelowAverage(int[] sales) {
        int months = 0;
        int average = averageSaleInMonth(sales);
        for (int sale : sales) {
            if (sale < average) {
                months = months + 1;
            }
        }
        return months;
    }

    //Кол-во месяцев с продажами выше среднего
    public int quantityMonthAboveAverage(int[] sales) {
        int months = 0;
        int average = averageSaleInMonth(sales);
        for (int sale : sales) {
            if (sale > average) {
                months = months + 1;
            }
        }
        return months;
    }

}
