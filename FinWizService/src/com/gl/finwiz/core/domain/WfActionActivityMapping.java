package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the WF_ACTION_ACTIVITY_MAPPING database table.
 * 
 */
@Entity
@Table(name="WF_ACTION_ACTIVITY_MAPPING")
@NamedQuery(name="WfActionActivityMapping.findAll", query="SELECT w FROM WfActionActivityMapping w")
public class WfActionActivityMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACTION_ACTIVITY_MAPPING_ID")
	private String actionActivityMappingId;

	private String waiting;

	public WfActionActivityMapping() {
	}

	public String getActionActivityMappingId() {
		return this.actionActivityMappingId;
	}

	public void setActionActivityMappingId(String actionActivityMappingId) {
		this.actionActivityMappingId = actionActivityMappingId;
	}

	public String getWaiting() {
		return this.waiting;
	}

	public void setWaiting(String waiting) {
		this.waiting = waiting;
	}

}