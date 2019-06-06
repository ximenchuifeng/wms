package com.yyorz.wmswebapi.user.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({ METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = MyConstraintValidator.class)
public @interface MyConstraint {
    String message() default "{com.yyorz.wmswebapi.user.validator.MyConstraint.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
