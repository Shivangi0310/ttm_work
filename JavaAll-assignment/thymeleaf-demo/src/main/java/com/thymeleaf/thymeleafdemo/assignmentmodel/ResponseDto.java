package com.thymeleaf.thymeleafdemo.assignmentmodel;

public class ResponseDto {

    private boolean status;
    private Object data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
