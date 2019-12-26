package com.nojava._01startspringboot.web;

import com.nojava.pojo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA.
 * Description:全局异常处理 对异常进行捕捉
 * 当系统抛出异常时会经过该异常
 * User: chaser
 * Date: 2018-12-06
 * Time: 23:03
 */
@RestControllerAdvice
public class MyAdviceController {

    private static final Logger logger= LoggerFactory.getLogger(MyAdviceController.class);

    /**
     * 系统异常捕获处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ResultBean javaExceptionHandler(Exception e){
        logger.error("捕获系统到异常"+e.getMessage(),e);
        /**
         * 处理异常
         */
        ResultBean resultBean = new ResultBean();
        resultBean.setErrormsg(e.getMessage());
        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            resultBean.setErrorCode("404");
        }else{
            resultBean.setErrorCode("404");
        }
        resultBean.setData(null);
        resultBean.setOk(false);
        return resultBean;
    }

    /**
     * 自定义异常捕获处理
     * @param e
     * @return
     */
//    @ExceptionHandler(value = BusinessException.class)
//    public ResultBean BusinessExceptionHandler(BusinessException e){
//        logger.error("捕获到自定义异常"+e.getMessage(),e);
//        /**
//         * 处理异常
//         */
//        return new ResultBean(e);
//    }
}
