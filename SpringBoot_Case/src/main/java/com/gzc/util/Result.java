package com.gzc.util;

import java.io.Serializable;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/06  09:21  周一
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class Result implements Serializable {

    private boolean status ; //响应状态  true  false
    private String msg ;  // 响应信息
    private Object data ;  //处理成功的响应数据

    public static Result ok(Object data){
        Result result = new Result();
        result.setStatus(true);
        result.setData(data);
        return  result ;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setStatus(false);
        result.setMsg(msg);
        return  result ;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
