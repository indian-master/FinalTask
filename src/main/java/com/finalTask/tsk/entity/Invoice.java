package com.finalTask.tsk.entity;

import java.sql.Timestamp;

public class Invoice extends Entity {

    private Long code;
    private String userName;
    private Boolean isPaid;
    private Integer statusId;
    private Timestamp date;
    private Double price;

    public Long getCode() {
        return code;
    }
    public String getUserName() {
        return userName;
    }
    public Boolean isPaid() {
        return isPaid;
    }
    public Integer getStatusId() {
        return statusId;
    }
    public Timestamp getDate() {
        return date;
    }
    public Double getPrice() {
        return price;
    }

    public void setCode(long code) {
        this.code = code;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
