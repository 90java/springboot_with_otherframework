package com.nojava.pojo;


import com.nojava.em.ResultCode;
import com.nojava.util.CommonUtils;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:定义一个接口返回值
 * 统一的接口规范
 * User: chaser
 * Date: 2018-11-03
 * Time: 13:38
 */
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    // 错误码，使用全局错误码。成功时，使用 true 失败 false 。
    private Boolean ok;

    /**
     *  错误码，使用全局错误码。待定。。。
     *  5000 系统内部错误
     */
    private String errorCode;

    // 错误提示。成功时，返回 "success" 。
    private String errormsg;

    // 具体业务数据。
    private T data;


    /**
     * 请求id 可以是一个uuid 可以进行链路追踪
     */
    private String requestid;

    public ResultBean(){
        this.requestid= CommonUtils.getUUid();
    }


    public ResultBean(T data) {
        this.requestid= CommonUtils.getUUid();
        this.data = data;
    }


    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }
}
