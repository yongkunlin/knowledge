package com.seaweed.corebaseapi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.seaweed.common.mybatis.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// lombok 自动生成getter setter 方法
@Data
// lombok 自动生成无参构造方法
@NoArgsConstructor
// lombok 自动生成 equals 和 hashCode 方法
// callSuper = true 调用父类的 equals 和 hashCode 方法
@EqualsAndHashCode(callSuper = true)
// mybatis-plus 指定数据库表名
@TableName("sys_user")
// swagger 生成文档
@ApiModel(value = "用户", description = "系统用户")
public class User extends BaseEntity {
}
