package com.seaweed.common.mybatis.tool.result;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Optional;

@Data
@NoArgsConstructor
@ToString
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private boolean success;
    private T data;
    private String msg;

    private Result(IResultCode resultCode) {
        this(resultCode, (T) null, resultCode.getMessage());
    }

    private Result(IResultCode resultCode, String msg) {
        this(resultCode, (T) null, msg);
    }

    private Result(IResultCode resultCode, T data) {
        this(resultCode, data, resultCode.getMessage());
    }

    private Result(IResultCode resultCode, T data, String msg) {
        this(resultCode.getCode(), data, msg);
    }

    private Result(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.success = ResultCode.SUCCESS.code == code;
    }

    public static boolean isSuccess(Result<?> result) {
        return (Boolean) Optional.ofNullable(result).map((x) -> {
            return Boolean.TRUE;
        }).orElse(Boolean.FALSE);
    }

    public static boolean isNotSuccess(Result<?> result) {
        return !isSuccess(result);
    }

    public static <T> Result<T> data(T data) {
        return data(data, "操作成功");
    }

    public static <T> Result<T> data(T data, String msg) {
        return data(200, data, msg);
    }

    public static <T> Result<T> data(int code, T data, String msg) {
        return new Result(code, data, data == null ? "暂无数据" : msg);
    }

    public static <T> Result<T> success(String msg) {
        return new Result(ResultCode.SUCCESS, msg);
    }

    public static <T> Result<T> success(IResultCode resultCode) {
        return new Result(resultCode);
    }

    public static <T> Result<T> success(IResultCode resultCode, String msg) {
        return new Result(resultCode, msg);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result(ResultCode.FAILURE, msg);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return new Result(code, (Object) null, msg);
    }

    public static <T> Result<T> fail(IResultCode resultCode) {
        return new Result(resultCode);
    }

    public static <T> Result<T> fail(IResultCode resultCode, String msg) {
        return new Result(resultCode, msg);
    }

    public static <T> Result<T> status(boolean flag) {
        return flag ? success("操作成功") : fail("操作失败");
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
