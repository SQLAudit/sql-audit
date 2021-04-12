package com.github.sqlaudit.base.exception;

import com.github.sqlaudit.base.entity.IResultCode;

/**
 * @author Jin Wang
 * @version 1.0
 * @date 2021-04-12 4:54 下午
 */
public class BaseException extends RuntimeException {

    private IResultCode resultCode;

    public BaseException(IResultCode resultCode, String message, Throwable cause) {
        super(message, cause);
        this.resultCode = resultCode;
    }

    public BaseException(IResultCode resultCode, Throwable cause) {
        super(resultCode.getMessage(), cause);
        this.resultCode = resultCode;
    }

    public BaseException(IResultCode resultCode, String message) {
        super(message);
        this.resultCode = resultCode;
    }

    public BaseException(IResultCode resultCode) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }

    public IResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(IResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
