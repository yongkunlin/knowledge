package com.seaweed.core.base.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.seaweed.common.mybatis.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用户类
 *
 * @author lyk
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_user")
@ApiModel(value = "用户", description = "系统用户")
public class User extends BaseEntity {
}
