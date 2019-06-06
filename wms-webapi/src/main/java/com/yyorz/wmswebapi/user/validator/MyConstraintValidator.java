package com.yyorz.wmswebapi.user.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {
    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("init");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        System.out.println(value);

        if (value instanceof String){
            String god = (String)value;
            if (god.equals("GOD")){
                return true;
            }
        }

        return false;
    }
}
