package com.gl.finwiz.form.validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.gl.finwiz.form.FinWizForm;
import com.gl.finwiz.model.LosApplicationM;
@Service("finwizValidateExecutorImpl")
public class FinwizValidateExecutorImpl implements Validator {
 
    //which objects can be validated by this validator
    @Override
    public boolean supports(Class<?> paramClass) {
        return FinWizForm.class.equals(paramClass);
    }
 
    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "losApplicationM.applicationId", "id.required");
        FinWizForm finWizForm = (FinWizForm) obj;

        LosApplicationM losApplicationM =   finWizForm.getLosApplicationM();
        if(losApplicationM.getApprovedBy()==null){
            errors.rejectValue("losApplicationM.approvedBy", "negativeValue", new Object[]{"'approvedBy'"}, "ApprovedBy can't be Null");
        }
         
      /*  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "role.required");*/
    }
}
