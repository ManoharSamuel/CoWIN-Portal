package com.projects.cowinportal.strategies.Availability;

import com.projects.cowinportal.models.Vaccine;

import java.util.List;

public interface SearchForAvailability {
    public List<Vaccine> getAvailableVaccines();
}
