package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Checklist {
    private ArrayList<Requirement> requirements;
    private Date startDate;
    private Double percentage;

    public Checklist( Date startDate, Double percentage) {

        this.startDate = startDate;
        this.percentage = percentage;
        this.requirements = new ArrayList<>();
    }

    public ArrayList<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(ArrayList<Requirement> requirements) {
        this.requirements = requirements;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public void addRequirements(Requirement requirements) {
        this.requirements.add(requirements);
    }
}
