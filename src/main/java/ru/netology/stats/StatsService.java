package ru.netology.stats;

public class StatsService {


    public int sum(int[] sales) {
        int result = 0;

        for (int sale : sales) {
            result += sale;

        }
        return result;
    }


    public int avg(int[] sales) {
        return sum(sales) / sales.length;
    }


    public int monthWithMax(int[] sales) {
        int max = max(sales);

        int monthNumber = 0;
        int monthWithMax = 0;
        for (int sale : sales) {
            monthNumber++;  
            if (sale == max) {
                monthWithMax = monthNumber;
            }
        }
            return monthWithMax ;
    }

       public int max(int[] sales) {
        int max  = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

        public int min(int[] sales) {
            int min  = sales[0];
            for (int sale : sales) {
                if (sale < min) {
                    min = sale;
                }
            }
            return min;
        }



       public int monthWithMin(int[] sales) {
        int min = min(sales);

        int monthNumber = 0;
        int monthWithMin = 0;
        for (int sale : sales) {
            monthNumber++;
            if (sale == min) {
                monthWithMin = monthNumber;
            }
        }
        return monthWithMin ;
    }

}


