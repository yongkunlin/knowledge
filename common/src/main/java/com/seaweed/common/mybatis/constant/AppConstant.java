package com.seaweed.common.mybatis.constant;

/**
 * @author lyk
 * 微服务名常量
 */
public class AppConstant {
    /**
     * 基础服务名
     * =========================
     * 注册中心
     */
    public static final String EUREKA = "eureka";
    /**
     * 配置中心
     */
    public static final String CONFIG = "config";
    /**
     * 路由
     */
    public static final String ZUUL = "zuul";
    /**
     * 基础应用服务
     * ====================
     * 基础应用服务名前缀
     */
    public static final String APPLICATION_NAME_PREFIX = "core-";
    /**
     * 基础应用外部访问服务名后缀
     */
    public static final String APPLICATION_NAME_SUFFIX = "-api";
    /**
     * 基础应用（内部）
     */
    public static final String APPLICATION_BASE = APPLICATION_NAME_PREFIX + "base";
    /**
     * 基础应用（外部）
     */
    public static final String APPLICATION_BASE_API = APPLICATION_NAME_PREFIX + "base" + APPLICATION_NAME_SUFFIX;
}
