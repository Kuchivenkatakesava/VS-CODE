package core;

class leap {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Considering current year & initializing same
        int year = 2020;
        // Considering user entered custom leap year
 
        int n = 15;
        // n is the no of leap years after year 2020
        // that is needed to print
 
        int count = 0;
        // Creating and initializing a variable
        // to maintain count of leap years
 
        while (count != n)
        // Conditionality check- Count variable should never
        // equals number of leap years to be printed
        {
 
            year = year + 1;
            // Incrementing the year count by 1
 
            if ((year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0)) {
 
                // If the year is leap year,then increment
                // the count
                count++;
 
                // Print the leap year
                System.out.println(year);
            }
        }
    }
}