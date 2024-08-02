package com.example.summer.api;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.http.HttpStatus;



class ApiUtils<T> {
    public static <T> ApiResult<T> success(T response){
        return new ApiResult<>(true, response, null);
    }
    public static  ApiResult<?> error(String msg, HttpStatus status){
        return new ApiResult<>(false, null, new ApiError(msg, status));
    }
    public static ApiResult<?> error(Throwable throwable, HttpStatus status){
        return new ApiResult<>(false, null, new ApiError(throwable, status));
    }
}
class ApiError extends Throwable{
    private HttpStatus code;
    private String message;
    public ApiError(String message, HttpStatus code){
        this.code = code;
        this.message = message;
    }

    public ApiError(Throwable throwable, HttpStatus code){
        super(throwable);
        this.code = code;
    }
}
class ApiResult<T> {
    private boolean success;
    private T response;
    private ApiError apiError;
    public ApiResult(boolean success, T response, ApiError apiError) {
        this.success = success;
        this.response = response;
        this.apiError = apiError;
    }
}