package ru.netology.stats;

public class StatsService {

    //сумму всех продаж;

    public long sum(long[] sales) {
        long totalSale  = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        return totalSale;
    }

    //среднюю сумму продаж в месяц;

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }
     //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
     public int calcMonthMaxSale(long[] sales) {
        int monthMaxSale = 0;
         for (int i = 0; i < sales.length; i++) {
             if (sales[i] >= sales[monthMaxSale]){
                 monthMaxSale = i;
             }
         }
         return monthMaxSale + 1;
     }
     //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int calcMonthMinSale(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]){
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }
    //количество месяцев, в которых продажи были ниже среднего
    public int calcMonthsWithSalesBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }
    //количество месяцев, в которых продажи были выше среднего
    public int calcMonthsWithSalesHigherAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
