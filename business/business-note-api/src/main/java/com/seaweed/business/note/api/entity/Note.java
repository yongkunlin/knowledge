package com.seaweed.business.note.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.seaweed.common.mybatis.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 笔记
 *
 * @author lyk
 * @version 1.0
 * @date 2020/1/19 14:04
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_user")
@ApiModel(value = "笔记", description = "笔记管理")
public class Note extends BaseEntity {
}
