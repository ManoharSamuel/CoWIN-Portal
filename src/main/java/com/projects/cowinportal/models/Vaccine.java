package com.projects.cowinportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vaccine extends BaseModel{
    private String name;
    private String description;
    @Enumerated(value = EnumType.ORDINAL)
    private VaccineType vaccineType;
}
