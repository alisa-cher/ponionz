package fr.simplon.ponionz.validation;

import fr.simplon.ponionz.domain.dtos.LoanCreate;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MaxContributionValidator implements ConstraintValidator<MaxContribution, LoanCreate> {
    @Override
    public boolean isValid(LoanCreate loanCreate, ConstraintValidatorContext constraintValidatorContext) {
        int loan = loanCreate.getAmount();
        if (loanCreate.getContribution() == null) {
            return true;
        } else {
            return (loanCreate.getContribution() <= (loan / 2));
        }
    }
}
