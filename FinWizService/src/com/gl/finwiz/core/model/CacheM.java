package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Map;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("cacheM")
public class CacheM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;
	private Map cacheObject;
	public Map getCacheObject() {
		return cacheObject;
	}
	public void setCacheObject(Map cacheObject) {
		this.cacheObject = cacheObject;
	} 
	
}
