package com.zgs.confcenter.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName cc_model
 */
@TableName(value ="cc_model")
@Data
@Builder
public class Model implements Serializable {
    /**
     * 栏目id
     */
    @TableId(value = "model_id", type = IdType.AUTO)
    private Long modelId;

    /**
     * 栏目名称
     */
    @TableField(value = "model_name")
    private String modelName;

    /**
     * 栏目编码
     */
    @TableField(value = "model_code")
    private String modelCode;

    /**
     * 父栏目id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 创建用户
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 修改用户
     */
    @TableField(value = "update_user")
    private String updateUser;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    @DateTimeFormat
    private Date createDate;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    @DateTimeFormat
    private Date updateDate;

    /**
     * 是否已删除 0:否,1:是
     */
    @TableField(value = "is_delete")
    @TableLogic(delval = "1",value = "0")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}