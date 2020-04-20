package com.qf.springbootnew.pojo;

public class ResultBean<T> {
    private String status;
    private T date;

    public ResultBean(String status, T date) {
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
