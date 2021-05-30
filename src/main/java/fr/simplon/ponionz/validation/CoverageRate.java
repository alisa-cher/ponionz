package fr.simplon.ponionz.validation;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = {CoverageRateValidator.class})

public @interface CoverageRate {
    java.lang.String message() default "Must be in this range: 30, 40, 50, 60, 70";

    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends javax.validation.Payload>[] payload() default {};
}
