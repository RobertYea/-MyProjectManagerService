package com.yq.myProjectManagerService.v1.entity.vo;

import com.yq.myProjectManagerService.v1.constant.Constans;

/**
 * 通用返回结果包装类
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/19
 */
public class ResultBean {

    private String status;

    private String message;

    private Object result;

    public ResultBean() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static ResultBean makeResult(boolean flag, String message, Object result) {
        ResultBean resultBean = new ResultBean();
        resultBean.setStatus(flag ? Constans.SUCCESS : Constans.ERROR);
        resultBean.setMessage(message);
        resultBean.setResult(result);
        return resultBean;
    }
}
