package com.seaweed.core.base.handler;

import com.seaweed.common.exception.base.BusinessException;
import com.seaweed.common.tool.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 *
 * @author lyk
 * @version 1.0
 * @date 2020/1/10 15:42
 */
@RestControllerAdvice
@Component
public class BusinessExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 处理自定义异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result handleRRException(BusinessException e) {
        return Result.businessException(e);
    }

    /**
     * 数据库重复异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Result handleDuplicateKeyException(DuplicateKeyException e) {
        return Result.duplicateKeyException();
    }

    /**
     * 全局异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        logger.error(e.getMessage(), e);
        return Result.exception();
    }
}
