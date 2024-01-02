package com.projects.cowinportal.dto;

import com.projects.cowinportal.models.Appointment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookAppointmentResponseDTO {
    private Appointment appointment;
    private String responseCode;
    private String responseMessage;
}
