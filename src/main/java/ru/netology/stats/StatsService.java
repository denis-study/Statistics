package ru.netology.stats;

public class StatsService {

    public int calculateSumSales(int[] values) {
        int sumSales = 0, month = 0;
        for (int value : values) {
            sumSales += value;

        }
        return sumSales;
    }


    public int calculateMiddleSumSales(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        int middleSales = sum / values.length;
        return middleSales;
    }


    public int calculateSalesMax(int[] values) {
        int salesMax = values[0], month = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] >= salesMax) {
                salesMax = values[i];
                month = i;
            }
        }
        return month;
    }


    public int calculateSalesMin(int[] values) {
        int salesMin = values[0], month = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] <= salesMin) {
                salesMin = values[i];
                month = i;

            }
        }
        return month;
    }


    public int calculateMonthsLowMiddleSales(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        int middleSales = sum / values.length;

        int lowSales = values[0], month = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < middleSales) {
                lowSales = values[i];
                month = i;

            }
        }
        return month;
    }






    public int calculateMonthsUpMiddleSales(int[]values){
        int month=0;
        for(int value:values){

        month+=month;


        }
        return month;
        }
        }