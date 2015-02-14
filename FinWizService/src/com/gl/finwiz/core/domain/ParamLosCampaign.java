package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_LOS_CAMPAIGN database table.
 * 
 */
@Entity
@Table(name="PARAM_LOS_CAMPAIGN")
@NamedQuery(name="ParamLosCampaign.findAll", query="SELECT p FROM ParamLosCampaign p")
public class ParamLosCampaign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAMPAIGN_ID")
	private String campaignId;

	@Column(name="FIN_ID")
	private String finId;

	public ParamLosCampaign() {
	}

	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}