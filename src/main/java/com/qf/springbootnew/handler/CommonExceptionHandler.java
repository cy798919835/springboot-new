package com.qf.springbootnew.handler;

import com.qf.springbootnew.pojo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class CommonExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e){
        /*1.错误日志记录下来*/
        /*2.给用户反馈*/
        logger.error(e.getMessage());
        return new ResultBean("faild","当前服务器繁忙");
    }
}
