package com.projects.cowinportal.strategies.UserLogin;

public class UserLoginStrategy {
    private final UserLogin userLogin;

    public UserLoginStrategy(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public boolean login(String loginId) {
        return userLogin.login(loginId);
    }

    public boolean validate(String loginId, String otp){
        return userLogin.validate(loginId, otp);
    }

}
