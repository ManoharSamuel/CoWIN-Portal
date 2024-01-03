package com.projects.cowinportal.dto;

import com.projects.cowinportal.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDTO {
    private String responseMessage;
    private User user;
    private String responseCode;
}
