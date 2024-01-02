package com.projects.cowinportal.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Appointment extends BaseModel{
    @OneToOne
    private User user;
    private long referenceNumber;
    @Enumerated(value = EnumType.ORDINAL)
    private AppointmentStatus appointmentStatus;
    @ManyToOne
    private TimeSlot timeSlot;
}
