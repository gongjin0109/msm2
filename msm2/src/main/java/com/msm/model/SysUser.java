package com.msm.model;


import java.io.Serializable;

/**
 * 系统用户
 * @author
 *
 */
public class SysUser extends BaseModel implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4537256325221003110L;

	/**
     * 主键
     */
    private Long id;

    /**
     * 机构ID
     */
    private Long organizationId;

    /**
     * 用户名
     */
    private String username;
    
    /**
     * 真实姓名
     * 后面添加的
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 角色列表
     */
    private String roleIds;

    /**
     * 账户是否锁定
     */
    private Boolean locked;
    
    /**
     * 用户绑定手机号
     */
    private String phone;
    
    /**
     * 用户绑定邮箱
     */
    private String email;
    
    /**
     * 合作方ID
     */
    private Long partnerId;
    
    /**
     * 合作方名称(非数据库字段)
     */
    private String partnerName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
    
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

}