
package System;


public class projDate {
    
    private int hour;
    private int day;
    private int month;
    private int year;

   
    public projDate(int hour, int day, int month, int year) {
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
   public projDate() {
        this.hour = 0;
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    
    
    public void setHour(int hour) {
        if (0 < hour && hour < 24)
            this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setDay(int day) {
            this.day = day;
    }
    
    public int getDay() {
        return day;
    }

     public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

     public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    
//    public void modifyDate ()
//    {
//    }
    
}
