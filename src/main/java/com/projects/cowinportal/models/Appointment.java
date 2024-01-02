package com.projects.cowinportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Appointment extends BaseModel{
    @OneToOne
    private User user;
    @ManyToOne
    private TimeSlot timeSlot;
}
