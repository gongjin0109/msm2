package com.msm.model;

import java.sql.Timestamp;

/**
 * 扩展isDeleted于updateTime的基类
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:11:58
 */
public class BaseModel implements Cloneable{

	/**
	 * (is_deleted)是否删除
	 */
	private Boolean isDeleted;

	/**
	 * (update_time) 更新时间
	 */
	private Timestamp updateTime;

	public Boolean getDeleted() {
		return isDeleted;
	}

	public void setDeleted(Boolean deleted) {
		isDeleted = deleted;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "BaseModel{" +
				"isDeleted=" + isDeleted +
				", updateTime=" + updateTime +
				'}';
	}
}
