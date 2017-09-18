package com.dnnd.common.pojo;

import java.util.Date;

/**
 * 基本属性类
 * @author gldnnd
 */
public class BasePOJO {

	/**
	 * 0 不可用 ； 1 可用
	 */
	int enableFlag;
	
	/**
	 * 创建时间 yyyy-MM-dd HH:mm:ss
	 */
	Date createDate;
	
	/**
	 * 创建人ID
	 */
	long createByUserId;
	
	/**
	 * 更新时间 yyyy-MM-dd HH:mm:ss
	 */
	Date updateDate;
	
	/**
	 * 更新人ID
	 */
	long updateByUserId;

	public int getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(int enableFlag) {
		this.enableFlag = enableFlag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public long getCreateByUserId() {
		return createByUserId;
	}

	public void setCreateByUserId(long createByUserId) {
		this.createByUserId = createByUserId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public long getUpdateByUserId() {
		return updateByUserId;
	}

	public void setUpdateByUserId(long updateByUserId) {
		this.updateByUserId = updateByUserId;
	}
}
