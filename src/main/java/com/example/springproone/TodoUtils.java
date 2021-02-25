package com.example.springproone;

import java.util.Date;

public class TodoUtils {
   private long id;
   private String discription;
   private Date date;
   private boolean status;

    public TodoUtils(long id, String discription, Date date, boolean status) {
        this.id = id;
        this.discription = discription;
        this.date = date;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
