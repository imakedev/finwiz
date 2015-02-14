package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SYSTEM_CACHE database table.
 * 
 */
@Entity
@Table(name="SYSTEM_CACHE")
@NamedQuery(name="SystemCache.findAll", query="SELECT s FROM SystemCache s")
public class SystemCache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CACHE_ID")
	private String cacheId;

	@Column(name="CACHE_JAVA")
	private String cacheJava;

	@Column(name="CACHE_STATUS")
	private int cacheStatus;

	@Column(name="COLUMN_DESC")
	private String columnDesc;

	@Column(name="COLUMN_KEY")
	private String columnKey;

	@Column(name="TABLE_NAME")
	private String tableName;

	public SystemCache() {
	}

	public String getCacheId() {
		return this.cacheId;
	}

	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
	}

	public String getCacheJava() {
		return this.cacheJava;
	}

	public void setCacheJava(String cacheJava) {
		this.cacheJava = cacheJava;
	}

	public int getCacheStatus() {
		return this.cacheStatus;
	}

	public void setCacheStatus(int cacheStatus) {
		this.cacheStatus = cacheStatus;
	}

	public String getColumnDesc() {
		return this.columnDesc;
	}

	public void setColumnDesc(String columnDesc) {
		this.columnDesc = columnDesc;
	}

	public String getColumnKey() {
		return this.columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}