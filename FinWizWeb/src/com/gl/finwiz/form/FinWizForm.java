// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:12:24 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   CandidateForm.java

package com.gl.finwiz.form;

import java.io.Serializable;

import com.gl.finwiz.core.los.model.LosCustomerM;
import com.gl.finwiz.model.LosApplicationM;


// Referenced classes of package th.co.aoe.makedev.missconsult.exam.form:
//            CommonForm

public class FinWizForm extends CommonForm
    implements Serializable
{
	private static final long serialVersionUID = 1L;
	private LosApplicationM losApplicationM;
	private LosCustomerM losCustomerM;
    public FinWizForm()
    {
      losApplicationM = new LosApplicationM();
      losCustomerM =new LosCustomerM();
    }
	public LosApplicationM getLosApplicationM() {
		return losApplicationM;
	}
	public void setLosApplicationM(LosApplicationM losApplicationM) {
		this.losApplicationM = losApplicationM;
	}
	public LosCustomerM getLosCustomerM() {
		return losCustomerM;
	}
	public void setLosCustomerM(LosCustomerM losCustomerM) {
		this.losCustomerM = losCustomerM;
	}



  
}
