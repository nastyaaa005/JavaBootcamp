package sef.module4.activity;

import java.util.Date;

public class DateActivity {

    private Date date = null;
    private long years;

    public DateActivity(Date date) {
        this.date = date;
    }

    public DateActivity(Date date, long years) {
        this.date = date;
        this.years = years;
    }

    public long getYears() {
        return years;
    }

    public void setYears(long years) {
        this.years = years;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public DateActivity() { }


    public static void main(String[] args){

        Date date = new Date();
        System.out.println("Today is " + date);

    }
}
