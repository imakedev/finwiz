package com.gl.finwiz.core.xstream.common;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("finWizMessage")
public class FinWizMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	@XStreamAlias("msgCode")
	private String msgCode;
	
	@XStreamAlias("msgDesc")
	private String msgDesc;
	
	private Exception exception;
	
	public FinWizMessage(){
	}

	public FinWizMessage(String msgCode){
		this.setMsgCode(msgCode);
	}

	public FinWizMessage(String msgCode, String msgDesc){
		this.msgCode = msgCode;
		this.msgDesc = msgDesc;
	}

	public FinWizMessage(String msgCode, Exception exception){
		this.setMsgCode(msgCode);
		this.setException(exception);
	}

	public FinWizMessage(String msgCode, String msgDesc, Exception exception){
		this.msgCode = msgCode;
		this.msgDesc = msgDesc;
		this.setException(exception);
	}
	
	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
		
	}
	public String getMsgDesc() {
		return msgDesc;
	}
	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}
	
}	
