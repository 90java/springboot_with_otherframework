package com.nojava.em;

/**
 * Created with IntelliJ IDEA.
 * Description: 返回结果的枚举值，和信息
 * User: chaser
 * Date: 2018-11-04
 * Time: 21:44
 */
public enum ResultCode {
    PARAM_IS_SUCCESS("E0000", "成功"),
    PARAM_IS_INVALID("E4001", "无效参数"),
    RESULE_DATA_NONE("E4002","数据未找到"),
    SESSION_INVALID("E4003","Session过期"),
//    DATA_ALREADY_EXISTED(),
//    USER_NOT_LOGGED_IN(),
//    PERMISSION_NO_ACCESS(),
//    INTERFACE_OUTTER_INVOKE_ERROR(),
//    SYSTEM_INNER_ERROR();

    SYSTEM_ERROR("E9999","系统异常");


    private String code;

    private String msg;

    ResultCode(String code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
