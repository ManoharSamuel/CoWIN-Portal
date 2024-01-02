package com.projects.cowinportal.strategies.Availability;

import com.projects.cowinportal.models.Vaccine;

import java.util.List;

public class SearchForAvailabilityStrategy {
    private final SearchForAvailability searchForAvailability;

    public SearchForAvailabilityStrategy(SearchForAvailability searchForAvailability) {
        this.searchForAvailability = searchForAvailability;
    }

    public List<Vaccine> getAvailableVaccines(){
        return searchForAvailability.getAvailableVaccines();
    }
}
