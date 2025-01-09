package com.example.beans;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.text.SimpleDateFormat;
import java.util.Date;

@Named
@RequestScoped
public class DateBean {
    public String getCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}