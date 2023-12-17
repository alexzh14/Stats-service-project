package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int salesAverage(int[] sales) {
        int average = salesAmount(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numbersOfMonthsBelowAverage(int[] sales) {
        int counterBelow = 0;
        int averageSale = salesAverage(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                counterBelow++;
            }
        }
        return counterBelow;
    }

    public int numbersOfMonthsAboveAverage(int[] sales) {
        int counterAbove = 0;
        int averageSale = salesAverage(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                counterAbove++;
            }
        }
        return counterAbove;
    }
}