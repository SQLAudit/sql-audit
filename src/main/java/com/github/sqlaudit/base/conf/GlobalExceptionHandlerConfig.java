package com.github.sqlaudit.base.conf;

import com.github.sqlaudit.base.entity.Response;
import com.github.sqlaudit.base.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jin Wang
 * @version 1.0
 * @date 2021-04-12 4:54 下午
 */
@Slf4j
@Component
public class GlobalExceptionHandlerConfig {

    @ResponseBody
    @ExceptionHandler(value = BaseException.class)
    public Response<?> baseExceptionHandler(BaseException e) {
        log.error("捕获BaseException", e);
        return Response.fail(e.getResultCode());
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Response<?> baseExceptionHandler(Exception e) {
        log.error("捕获Exception", e);
        return Response.fail(e.getMessage());
    }
}
