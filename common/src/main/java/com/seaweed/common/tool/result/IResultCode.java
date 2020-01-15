package com.seaweed.common.tool.result;

import java.io.Serializable;

/**
 * 结果接口
 *
 * @author lyk
 */
public interface IResultCode extends Serializable {
    /**
     * 获取结果消息
     *
     * @return 结果内容文本
     */
    String getMessage();

    /**
     * 获取结果code
     *
     * @return 结果code
     */
    int getCode();
}
