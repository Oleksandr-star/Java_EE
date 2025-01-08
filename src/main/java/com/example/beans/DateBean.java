package com.example.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBean {
    private final String currentDate;

    public DateBean() {
        this.currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public String getCurrentDate() {
        return currentDate;
    }
}
