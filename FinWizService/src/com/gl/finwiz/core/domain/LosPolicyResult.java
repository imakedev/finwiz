package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LOS_POLICY_RESULT database table.
 * 
 */
@Entity
@Table(name="LOS_POLICY_RESULT")
@NamedQuery(name="LosPolicyResult.findAll", query="SELECT l FROM LosPolicyResult l")
public class LosPolicyResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LosPolicyResultPK id;

	//bi-directional many-to-one association to LosApplication
	@ManyToOne
	@JoinColumn(name="LOS_APP_ID",insertable=false,updatable=false)
	private LosApplication losApplication;

	public LosPolicyResult() {
	}

	public LosPolicyResultPK getId() {
		return this.id;
	}

	public void setId(LosPolicyResultPK id) {
		this.id = id;
	}

	public LosApplication getLosApplication() {
		return this.losApplication;
	}

	public void setLosApplication(LosApplication losApplication) {
		this.losApplication = losApplication;
	}

}