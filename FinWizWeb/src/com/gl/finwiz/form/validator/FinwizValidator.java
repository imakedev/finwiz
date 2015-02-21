package com.gl.finwiz.form.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.gl.finwiz.core.los.model.LosApplicationM;

public class FinwizValidator implements Validator {
 
    //which objects can be validated by this validator
    @Override
    public boolean supports(Class<?> paramClass) {
        return LosApplicationM.class.equals(paramClass);
    }
 
    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
         
        LosApplicationM losApplicationM = (LosApplicationM) obj;
        if(losApplicationM.getApprovedBy()==null){
            errors.rejectValue("approvedBy", "negativeValue", new Object[]{"'approvedBy'"}, "ApprovedBy can't be Null");
        }
         
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "role.required");
    }
}
