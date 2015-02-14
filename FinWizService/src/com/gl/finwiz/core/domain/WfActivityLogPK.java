package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the WF_ACTIVITY_LOG database table.
 * 
 */
@Embeddable
public class WfActivityLogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACTIVITY_LOG_ID")
	private String activityLogId;

	@Column(name="WF_ACTIVITY_INSTANCE_ID", insertable=false, updatable=false)
	private String wfActivityInstanceId;

	public WfActivityLogPK() {
	}
	public String getActivityLogId() {
		return this.activityLogId;
	}
	public void setActivityLogId(String activityLogId) {
		this.activityLogId = activityLogId;
	}
	public String getWfActivityInstanceId() {
		return this.wfActivityInstanceId;
	}
	public void setWfActivityInstanceId(String wfActivityInstanceId) {
		this.wfActivityInstanceId = wfActivityInstanceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WfActivityLogPK)) {
			return false;
		}
		WfActivityLogPK castOther = (WfActivityLogPK)other;
		return 
			this.activityLogId.equals(castOther.activityLogId)
			&& this.wfActivityInstanceId.equals(castOther.wfActivityInstanceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.activityLogId.hashCode();
		hash = hash * prime + this.wfActivityInstanceId.hashCode();
		
		return hash;
	}
}