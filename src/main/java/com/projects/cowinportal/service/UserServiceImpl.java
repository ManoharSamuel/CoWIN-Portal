package com.projects.cowinportal.service;

import com.projects.cowinportal.models.*;
import com.projects.cowinportal.strategies.Availability.SearchForAvailability;
import com.projects.cowinportal.strategies.Availability.SearchForAvailabilityFactory;
import com.projects.cowinportal.strategies.Availability.SearchForAvailabilityStrategy;
import com.projects.cowinportal.strategies.Availability.SearchType;
import com.projects.cowinportal.strategies.UserLogin.LoginType;
import com.projects.cowinportal.strategies.UserLogin.UserLogin;
import com.projects.cowinportal.strategies.UserLogin.UserLoginFactory;
import com.projects.cowinportal.strategies.UserLogin.UserLoginStrategy;

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
        Appointment appointment = new Appointment();
        initialNotification(appointment);
        reminderNotification(appointment);
        return null;
    }

    @Override
    public boolean cancelAppointment(long referenceNumber) {
        return false;
    }

    @Override
    public Notification initialNotification(Appointment appointment) {
        Notification notification = new Notification();
        notification.setAppointment(appointment);
        notification.setMessage("Vaccine appointment is schedule for "+appointment.getTimeSlot());
        return notification;
    }

    @Override
    public Notification reminderNotification(Appointment appointment) {
        Notification notification = new Notification();
        notification.setAppointment(appointment);
        notification.setMessage("Reminder! Vaccine appointment is schedule for today");
        return notification;
    }

    @Override
    public boolean login(LoginType loginType, String loginId, String otp) {
        UserLogin userLogin = UserLoginFactory.getUserLogin(loginType);
        UserLoginStrategy userLoginStrategy = new UserLoginStrategy(userLogin);
        return userLoginStrategy.login(loginId);
    }

    @Override
    public void signUp(String name, String email, String phoneNumber, String aadhaarNumber) {

    }
}
