package com.dnnd.pojo;

import com.dnnd.common.pojo.BasePOJO;
/**
 * 菜单 pojo
 * @author gldnnd
 */
public class Menu extends BasePOJO{

	/**
	 * 主键
	 */
	private long id;
	
	/**
	 * 路径
	 */
	private String menuUri;

	/**
	 * 名称
	 */
	private String menuName;

	/**
	 * 描述
	 */
	private String menuDesc;

	/**
	 * 图标
	 */
	private String iconCls;
	
	/**
	 * 上级ID
	 */
	private String parentId;
	
	/**
	 * 排序号
	 */
	private Integer orderNo;
	
	/**
	 *是否在新窗口打开： 1是0否
	 */
	private Integer isTargetBlank;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMenuUri() {
		return menuUri;
	}

	public void setMenuUri(String menuUri) {
		this.menuUri = menuUri;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDesc() {
		return menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getIsTargetBlank() {
		return isTargetBlank;
	}

	public void setIsTargetBlank(Integer isTargetBlank) {
		this.isTargetBlank = isTargetBlank;
	}
}
