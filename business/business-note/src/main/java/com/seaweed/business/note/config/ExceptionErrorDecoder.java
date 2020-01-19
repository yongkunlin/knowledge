//package com.seaweed.business.note.config;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.TypeReference;
//import com.seaweed.common.exception.base.BusinessException;
//import feign.FeignException;
//import feign.Response;
//import feign.Util;
//import feign.codec.ErrorDecoder;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 异常处理
// *
// * @author lyk
// * @version 1.0
// * @date 2020/1/15 10:19
// */
//@Configuration
//public class ExceptionErrorDecoder implements ErrorDecoder {
//
//    @Override
//    public Exception decode(String methodKey, Response response) {
//        try {
//            if (response.body() != null) {
//                BusinessException businessException = JSON.parseObject(Util.toString(response.body().asReader()), new TypeReference<BusinessException>() {
//                });
//                return businessException;
////                Class clazz = Class.forName(businessException.getException());
////                return (Exception) clazz.getDeclaredConstructor(String.class).newInstance(businessException.getMsg());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return FeignException.errorStatus(methodKey, response);
//    }
//}