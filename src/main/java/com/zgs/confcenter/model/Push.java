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
 * @TableName cc_push
 */
@TableName(value ="cc_push")
@Data
@Builder
public class Push implements Serializable {
    /**
     * 发布id
     */
    @TableId(value = "push_id")
    private Long pushId;

    /**
     * 栏目属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;

    /**
     * 发布环境
     */
    @TableField(value = "push_env")
    private String pushEnv;

    /**
     * 版本号
     */
    @TableField(value = "push_version")
    private String pushVersion;

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
     * 是否已删除 0:否,1:是
     */
    @TableField(value = "is_delete")
    @TableLogic(delval = "1",value = "0")
    private Integer isDelete;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    private LocalDateTime updateDate;

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
        Push other = (Push) that;
        return (this.getPushId() == null ? other.getPushId() == null : this.getPushId().equals(other.getPushId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getPushEnv() == null ? other.getPushEnv() == null : this.getPushEnv().equals(other.getPushEnv()))
            && (this.getPushVersion() == null ? other.getPushVersion() == null : this.getPushVersion().equals(other.getPushVersion()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPushId() == null) ? 0 : getPushId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getPushEnv() == null) ? 0 : getPushEnv().hashCode());
        result = prime * result + ((getPushVersion() == null) ? 0 : getPushVersion().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pushId=").append(pushId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", pushEnv=").append(pushEnv);
        sb.append(", pushVersion=").append(pushVersion);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}