package com.cym.film.service.common.exception;

public class DataTranctionException extends Exception {
    private Integer code;
    private String errMsg;

    public DataTranctionException(Integer code, String errMsg) {
        super(errMsg);
        this.code = code;
        this.errMsg = errMsg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "DataTranctionException{" +
                "code=" + code +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}
