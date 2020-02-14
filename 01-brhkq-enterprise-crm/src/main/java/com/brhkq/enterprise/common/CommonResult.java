package com.brhkq.enterprise.common;

import java.util.HashMap;

//公共返回对象
public class CommonResult{

    public int code;

    public String msg;

    public Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
