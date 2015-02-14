package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the WF_ACTIVITY database table.
 * 
 */
@Embeddable
public class WfActivityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACTIVITY_ID")
	private String activityId;

	@Column(name="WFP_ID", insertable=false, updatable=false)
	private String wfpId;

	public WfActivityPK() {
	}
	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getWfpId() {
		return this.wfpId;
	}
	public void setWfpId(String wfpId) {
		this.wfpId = wfpId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WfActivityPK)) {
			return false;
		}
		WfActivityPK castOther = (WfActivityPK)other;
		return 
			this.activityId.equals(castOther.activityId)
			&& this.wfpId.equals(castOther.wfpId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.activityId.hashCode();
		hash = hash * prime + this.wfpId.hashCode();
		
		return hash;
	}
}