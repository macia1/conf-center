package com.zgs.confcenter.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName cc_property
 */
@TableName(value ="cc_property")
@Data
@Builder
public class Property implements Serializable {
    /**
     * 栏目属性id
     */
    @TableId(value = "property_id", type = IdType.AUTO)
    private Long propertyId;

    /**
     * 属性名称
     */
    @TableField(value = "property_name")
    private String propertyName;

    /**
     * 属性编码
     */
    @TableField(value = "property_code")
    private String propertyCode;

    /**
     * 所属栏目id
     */
    @TableField(value = "model_id")
    private Long modelId;

    /**
     * 属性说明
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 属性内容
     */
    @TableField(value = "property_content")
    private String propertyContent;

    /**
     * 属性路径
     */
    @TableField(value = "property_path")
    private String propertyPath;

    /**
     * 版本号
     */
    @TableField(value = "property_version")
    private String propertyVersion;

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
    private LocalDateTime createDate;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    private LocalDateTime updateDate;

    /**
     * 是否已删除 0:否,1:是
     */
    @TableField(value = "is_delete")
    @TableLogic(delval = "1",value = "0")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Property other = (Property) that;
        return (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getPropertyCode() == null ? other.getPropertyCode() == null : this.getPropertyCode().equals(other.getPropertyCode()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPropertyContent() == null ? other.getPropertyContent() == null : this.getPropertyContent().equals(other.getPropertyContent()))
            && (this.getPropertyPath() == null ? other.getPropertyPath() == null : this.getPropertyPath().equals(other.getPropertyPath()))
            && (this.getPropertyVersion() == null ? other.getPropertyVersion() == null : this.getPropertyVersion().equals(other.getPropertyVersion()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getPropertyCode() == null) ? 0 : getPropertyCode().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPropertyContent() == null) ? 0 : getPropertyContent().hashCode());
        result = prime * result + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        result = prime * result + ((getPropertyVersion() == null) ? 0 : getPropertyVersion().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", propertyCode=").append(propertyCode);
        sb.append(", modelId=").append(modelId);
        sb.append(", remark=").append(remark);
        sb.append(", propertyContent=").append(propertyContent);
        sb.append(", propertyPath=").append(propertyPath);
        sb.append(", propertyVersion=").append(propertyVersion);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}