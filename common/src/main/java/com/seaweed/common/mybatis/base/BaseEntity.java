package com.seaweed.common.mybatis.base;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(
            value = "id",
            type = IdType.INPUT
    )
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("创建时间")
    @TableField(
            fill = FieldFill.INSERT
    )
    private Date createDate;
    @ApiModelProperty("更新时间")
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    private Date updateDate;
    @TableLogic
    @ApiModelProperty("是否已删除")
    private Integer isDeleted;
}
