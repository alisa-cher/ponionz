package fr.simplon.ponionz.domain.dtos;
import fr.simplon.ponionz.validation.CoverageRate;
import fr.simplon.ponionz.validation.MaxContribution;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@MaxContribution
@CoverageRate
public class LoanCreate {
    private static final int AMOUNT_MIN = 100000;
    private static final int AMOUNT_MAX = 600000;
    private static final int DURATION_MIN = 2;
    private static final int DURATION_MAX = 30;

    @NotNull
    @Min(AMOUNT_MIN)
    @Max(AMOUNT_MAX)
    private int amount;

    @Positive
    private Integer contribution;

    @NotNull
    @Min(DURATION_MIN)
    @Max(DURATION_MAX)
    private int duration;

    @NotNull
    @Positive
    private float interestRate;

    @Positive
    private Float assuranceRate;

    private boolean jobLossAssurance;

    private Integer coverageRate;

    public LoanCreate() {}

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer getContribution() {
        return contribution;
    }

    public void setContribution(Integer contribution) {
        this.contribution = contribution;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Float getAssuranceRate() {
        return assuranceRate;
    }

    public void setAssuranceRate(Float assuranceRate) {
        this.assuranceRate = assuranceRate;
    }

    public boolean isJobLossAssurance() {
        return jobLossAssurance;
    }

    public void setJobLossAssurance(boolean jobLossAssurance) {
        this.jobLossAssurance = jobLossAssurance;
    }

    public Integer getCoverageRate() {
        return coverageRate;
    }

    public void setCoverageRate(int coverageRate) {
        this.coverageRate = coverageRate;
    }

    @Override
    public String toString() {
        return "LoanCreate{" +
                "amount=" + amount +
                ", contribution=" + contribution +
                ", duration=" + duration +
                ", interestRate=" + interestRate +
                ", assuranceRate=" + assuranceRate +
                ", jobLossAssurance=" + jobLossAssurance +
                ", coverageRate=" + coverageRate +
                '}';
    }
}