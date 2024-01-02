package com.projects.cowinportal.strategies.UserLogin;

public interface UserLogin {
    public boolean login(String loginId);
    public boolean validate(String loginId, String otp);
}
