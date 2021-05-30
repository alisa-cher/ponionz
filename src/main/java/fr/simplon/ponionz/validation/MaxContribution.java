package fr.simplon.ponionz.validation;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = {MaxContributionValidator.class})

public @interface MaxContribution {
    java.lang.String message() default "Must be maximum 50% of the total amount";

    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends javax.validation.Payload>[] payload() default {};
}
