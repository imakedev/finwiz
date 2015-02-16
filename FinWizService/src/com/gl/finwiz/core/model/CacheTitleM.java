package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Map;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("cacheTitleM")
public class CacheTitleM extends  FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;
	private Map cacheValue;
	public Map getCacheValue() {
		return cacheValue;
	}
	public void setCacheValue(Map cacheValue) {
		this.cacheValue = cacheValue;
	} 
}
