package com.gl.finwiz.core.xstream.common;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
 
/**
 * @author Chatchai Pimtun 
 *
 */
@XStreamAlias("finWizResultMessage")
public class FinWizResultMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias("resultMessage") 
	private FinWizMessage resultMessage;
	
	//@XStreamImplicit(itemFieldName="resultListObj")
	@SuppressWarnings("rawtypes")
	@XStreamAlias("resultListObj") 
	private List resultListObj;
	
	@XStreamAlias("maxRow")
	private String maxRow;
	
	@XStreamAlias("lastpage")
	private String lastpage;
	
	@XStreamAlias("returnId")
	private String returnId;
	
	public String getReturnId() {
		return returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	public FinWizMessage getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(FinWizMessage resultMessage) {
		this.resultMessage = resultMessage;
	}
	 
	@SuppressWarnings("rawtypes")
	public List getResultListObj() {
		return resultListObj;
	}
	@SuppressWarnings("rawtypes")
	public void setResultListObj(List  resultListObj) {
		this.resultListObj = resultListObj;
	}
	public String getMaxRow() {
		return maxRow;
	}
	public void setMaxRow(String maxRow) {
		this.maxRow = maxRow;
	}
	public String getLastpage() {
		return lastpage;
	}
	public void setLastpage(String lastpage) {
		this.lastpage = lastpage;
	}
	
	
}