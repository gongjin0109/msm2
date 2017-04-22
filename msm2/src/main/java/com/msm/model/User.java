package com.msm.model;


import java.io.Serializable;

/**
 * 数据库【t_usre】映射实体类
 */
public class User extends BaseModel implements Serializable {

	private static final long serialVersionUID = 9221266606319876262L;


	/**
	 * 交易密码
	 */
	private String securePassword;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号码
	 */
	private String mobilePhone;

	/**
	 * 用户密码
	 */
	private String userPassword;


	/**
	 * 用户类型（1 机构 2经理 3借款人 4博商学员 6企业）
	 */
	private String roleMark;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 描述
	 */
	private String userDesc;

	/**
	 * 密码后缀
	 */
	private String salt;

	/**
	 * 是否绑定手机号码
	 */
	private int isCheckPhone;

	/**
	 * 是否绑定邮箱
	 */
	private int isCheckEmail;

	/**
	 * 防钓鱼信息
	 */
	private String validationInfo;

	/**
	 * 密码保护问题
	 */
	private String pwdProtectQuestion;

	/**
	 * 密码保护答案
	 */
	private String pwdProtectAnswer;

	/**
	 * 第三方账户ID
	 */
	private String thirdPartyAccount;

	/**
	 * 用户登录后生成的登录ID
	 */
	private String loginId;

	/**
	 * 未激活邮箱
	 */
	private String noActivateEmail;

	/**
	 * 微信id
	 */
	private String wechatId;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getSecurePassword() {
		return securePassword;
	}

	public void setSecurePassword(String securePassword) {
		this.securePassword = securePassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRoleMark() {
		return roleMark;
	}

	public void setRoleMark(String roleMark) {
		this.roleMark = roleMark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getIsCheckPhone() {
		return isCheckPhone;
	}

	public void setIsCheckPhone(int isCheckPhone) {
		this.isCheckPhone = isCheckPhone;
	}

	public int getIsCheckEmail() {
		return isCheckEmail;
	}

	public void setIsCheckEmail(int isCheckEmail) {
		this.isCheckEmail = isCheckEmail;
	}

	public String getValidationInfo() {
		return validationInfo;
	}

	public void setValidationInfo(String validationInfo) {
		this.validationInfo = validationInfo;
	}

	public String getPwdProtectQuestion() {
		return pwdProtectQuestion;
	}

	public void setPwdProtectQuestion(String pwdProtectQuestion) {
		this.pwdProtectQuestion = pwdProtectQuestion;
	}

	public String getPwdProtectAnswer() {
		return pwdProtectAnswer;
	}

	public void setPwdProtectAnswer(String pwdProtectAnswer) {
		this.pwdProtectAnswer = pwdProtectAnswer;
	}

	public String getThirdPartyAccount() {
		return thirdPartyAccount;
	}

	public void setThirdPartyAccount(String thirdPartyAccount) {
		this.thirdPartyAccount = thirdPartyAccount;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getNoActivateEmail() {
		return noActivateEmail;
	}

	public void setNoActivateEmail(String noActivateEmail) {
		this.noActivateEmail = noActivateEmail;
	}

	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	@Override
	public String toString() {
		return "User{" +
				"securePassword='" + securePassword + '\'' +
				", userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", email='" + email + '\'' +
				", mobilePhone='" + mobilePhone + '\'' +
				", userPassword='" + userPassword + '\'' +
				", roleMark='" + roleMark + '\'' +
				", createTime=" + createTime +
				", userDesc='" + userDesc + '\'' +
				", salt='" + salt + '\'' +
				", isCheckPhone=" + isCheckPhone +
				", isCheckEmail=" + isCheckEmail +
				", validationInfo='" + validationInfo + '\'' +
				", pwdProtectQuestion='" + pwdProtectQuestion + '\'' +
				", pwdProtectAnswer='" + pwdProtectAnswer + '\'' +
				", thirdPartyAccount='" + thirdPartyAccount + '\'' +
				", loginId='" + loginId + '\'' +
				", noActivateEmail='" + noActivateEmail + '\'' +
				", wechatId='" + wechatId + '\'' +
				'}';
	}
}
