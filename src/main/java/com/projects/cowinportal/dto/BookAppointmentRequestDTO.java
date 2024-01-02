package com.projects.cowinportal.dto;

import com.projects.cowinportal.models.Hospital;
import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookAppointmentRequestDTO {
    private User user;
    private TimeSlot timeSlot;
}
