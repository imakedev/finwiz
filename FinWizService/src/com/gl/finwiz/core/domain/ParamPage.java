package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the PARAM_PAGE database table.
 * 
 */
@Entity
@Table(name="PARAM_PAGE")
public class ParamPage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAGE_ID")
	private String pageId;

	@Column(name="MENU_NAME")
	private String menuName;

	@Column(name="PAGE_PATH")
	private String pagePath;
	

	@Column(name="MENU_ICON")
	private String menuIcon;
	
	
	@Column(name="MENU_ORDER")
	private Integer menuOrder;

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	//bi-directional many-to-one association to ParamFinPageMapping
	/*@OneToMany(mappedBy="paramPage")
	private List<ParamFinPageMapping> paramFinPageMappings;

	//bi-directional many-to-one association to ParamTab
	@OneToMany(mappedBy="paramPage")
	private List<ParamTab> paramTabs;
*/
	public ParamPage() {
	}

	public String getPageId() {
		return this.pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getPagePath() {
		return this.pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	
}