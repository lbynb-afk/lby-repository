package com.example.springbootdemo.exception;

import com.example.springbootdemo.pojo.dto.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 32035
 * @date 2025/7/20
 */

@RestControllerAdvice//专门做异常处理的注解
public class GlobalExceptionHandlerAdvice {

    Logger log =  LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class})
    public ResponseMessage handlerException(Exception e, HttpServletRequest request, HttpServletResponse response){
        //记录日志
        log.error("统一异常",e);
        return new ResponseMessage(500,"error",null);
    }
}
