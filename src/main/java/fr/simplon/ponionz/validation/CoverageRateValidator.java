package fr.simplon.ponionz.validation;

import fr.simplon.ponionz.domain.dtos.LoanCreate;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CoverageRateValidator implements ConstraintValidator<CoverageRate, LoanCreate> {
    private static final List<Integer> list = Arrays.asList(30, 40, 50, 60, 70);

    @Override
    public boolean isValid(LoanCreate loan, ConstraintValidatorContext constraintValidatorContext) {
        if (loan.isJobLossAssurance()) {
            return list.contains(loan.getCoverageRate());
        }
        return true;
    }
}
