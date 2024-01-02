package com.projects.cowinportal.strategies.UserLogin;

public class UserLoginFactory {
    public static UserLogin getUserLogin(LoginType loginType){
        return switch (loginType) {
            case MOBILE -> new UserLoginByMobile();
            case AADHAAR -> new UserLoginByAadhaar();
        };
    }
}
