package com.projects.cowinportal.service;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.models.User;
import com.projects.cowinportal.models.Vaccine;
import com.projects.cowinportal.strategies.Availability.SearchForAvailability;
import com.projects.cowinportal.strategies.Availability.SearchForAvailabilityFactory;
import com.projects.cowinportal.strategies.Availability.SearchForAvailabilityStrategy;
import com.projects.cowinportal.strategies.Availability.SearchType;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Override
    public List<Vaccine> searchVaccines(SearchType searchType) {
        SearchForAvailability searchForAvailability = SearchForAvailabilityFactory.getSearchForAvailability(searchType);
        SearchForAvailabilityStrategy searchForAvailabilityStrategy = new SearchForAvailabilityStrategy(searchForAvailability);
        return searchForAvailabilityStrategy.getAvailableVaccines();
    }

    @Override
    public Appointment bookAppointment(User user, TimeSlot timeSlot) {
        return null;
    }

    @Override
    public boolean cancelAppointment(long referenceNumber) {
        return false;
    }
}
