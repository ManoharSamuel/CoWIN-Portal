package com.projects.cowinportal.strategies.UserLogin;

import java.util.Scanner;

public class UserLoginByMobile implements UserLogin{
    @Override
    public boolean login(String mobileNumber) {
        Scanner sc = new Scanner(System.in);
        String otp = sc.next();
        return validate(mobileNumber,otp);
    }

    @Override
    public boolean validate(String mobileNumber, String otp) {
        return false;
    }
}
