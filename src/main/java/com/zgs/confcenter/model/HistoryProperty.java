package com.zgs.confcenter.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName cc_history_property
 */
@TableName(value ="cc_history_property")
@Data
@Builder
public class HistoryProperty implements Serializable {
    /**
     * 属性轨迹id
     */
    @TableId(value = "history_id")
    private Long historyId;

    /**
     * 栏目属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;

    /**
     * 属性路径
     */
    @TableField(value = "property_path")
    private String propertyPath;

    /**
     * 属性内容
     */
    @TableField(value = "property_content")
    private String propertyContent;

    /**
     * 属性版本号
     */
    @TableField(value = "history_version")
    private String historyVersion;

    /**
     * 栏目属性编码
     */
    @TableField(value = "history_property_code")
    private String historyPropertyCode;

    /**
     * 创建用户
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 更新用户
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
        HistoryProperty other = (HistoryProperty) that;
        return (this.getHistoryId() == null ? other.getHistoryId() == null : this.getHistoryId().equals(other.getHistoryId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getPropertyPath() == null ? other.getPropertyPath() == null : this.getPropertyPath().equals(other.getPropertyPath()))
            && (this.getPropertyContent() == null ? other.getPropertyContent() == null : this.getPropertyContent().equals(other.getPropertyContent()))
            && (this.getHistoryVersion() == null ? other.getHistoryVersion() == null : this.getHistoryVersion().equals(other.getHistoryVersion()))
            && (this.getHistoryPropertyCode() == null ? other.getHistoryPropertyCode() == null : this.getHistoryPropertyCode().equals(other.getHistoryPropertyCode()))
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
        result = prime * result + ((getHistoryId() == null) ? 0 : getHistoryId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        result = prime * result + ((getPropertyContent() == null) ? 0 : getPropertyContent().hashCode());
        result = prime * result + ((getHistoryVersion() == null) ? 0 : getHistoryVersion().hashCode());
        result = prime * result + ((getHistoryPropertyCode() == null) ? 0 : getHistoryPropertyCode().hashCode());
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
        sb.append(", historyId=").append(historyId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", propertyPath=").append(propertyPath);
        sb.append(", propertyContent=").append(propertyContent);
        sb.append(", historyVersion=").append(historyVersion);
        sb.append(", historyPropertyCode=").append(historyPropertyCode);
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